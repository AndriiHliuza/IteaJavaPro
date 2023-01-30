package com.itea.andrii.lecture3.hometask3;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private static double result; // Змінна для зберігання першого числа та результату
    private static double nextOperand; // Змінна в яку записується друге число
    private static String operation = ""; // Змінна яка зберігє знак операції
    private static String operand; // Змінна в яку записується число після введення його з клавіатури
    private static boolean isFirstOperand = true; // Змінна для перевірки того чи є введене число першим введеним в калькулятор
    private static TypeOfInputValue typeOfInputValue = TypeOfInputValue.OPERAND; // Змінна, що визначає тип значення, яке повинно вводитись (число/операція)

    private static final ArrayList<String> history = new ArrayList<>(); // Список для зберігання історії обчислень
    private static final StringBuilder expression = new StringBuilder(); // Змінна, що зберігає поточні обчислення
    public static void main(String[] args) {
        start();
    }

    /**
     * Метод який запускає роботу калькулятора
     */
    public static void start() {
        do {
            System.out.print("""
                |------------------------- Calculator --------------------------------------------------------|
                |                     Доступні операції:                                                      |
                |                 1. "+" (Додавання)                                                          |
                |                 2. "-" (Віднімання)                                                         |
                |                 3. "*" (Множення)                                                           |
                |                 4. "/" (Ділення)                                                            |
                |                 5. "="                                                                      |
                |                          5.1 Вивести результат                                              |
                |                          5.2 Зберегти обчислення в історію                                  |
                |                          5.3 Завершити обчислення виразу                                    |
                |                                                                                             |
                |                          Помітка: Результат не виводиться якщо не були проведені обчислення |
                |                                                                                             |
                |                 6. history (Побачити історію обчислень)                                     |
                |---------------------------------------------------------------------------------------------|
                """);
            rollBack();
            do {
                getValue();
                if (typeOfInputValue == TypeOfInputValue.OPERATION) {
                    if (operation.equals("=")) {
                        saveToHistory();
                        break;
                    } else if (operation.equals("history")) {
                        showHistory();
                        break;
                    } else if (!isOperationCorrect()) {
                        System.out.print("""
                                |----------------- Невірно введені дані ------------------------------------------------------|
                                |               Доступні варіанти вводу                                                       |
                                |                 1. "+" (Додавання)                                                          |
                                |                 2. "-" (Віднімання)                                                         |
                                |                 3. "*" (Множення)                                                           |
                                |                 4. "/" (Ділення)                                                            |
                                |                 5. "="                                                                      |
                                |                          5.1 Вивести результат                                              |
                                |                          5.2 Зберегти обчислення в історію                                  |
                                |                          5.3 Завершити обчислення виразу                                    |
                                |                                                                                             |
                                |                 6. history (Для виводу історії обчислень)                                   |
                                |---------------------------------------------------------------------------------------------|
                                """);
                        break;
                    }
                    typeOfInputValue = TypeOfInputValue.OPERAND;
                } else {
                    if (isOperandCorrect()) {
                        if (isFirstOperand) {
                            result = Double.parseDouble(operand.replace(",", "."));
                            expression.append(result);
                            isFirstOperand = false;
                        } else {
                            nextOperand = Double.parseDouble(operand.replace(",", "."));
                            if (nextOperand == 0 && operation.equals("/")) {
                                System.out.print("""
                                        |-----------------------------------|
                                        |      Помилка ділення на нуль      |
                                        |-----------------------------------|
                                        """);
                                break;
                            }
                            calculate();
                            System.out.println("......Проміжний результат......: " + result);
                        }
                    } else if (operand.equals("=")) {
                        if (!expression.toString().isEmpty()) {
                            saveToHistory();
                        }
                        break;
                    } else if (operand.equals("history")) {
                        showHistory();
                        break;
                    } else {
                        System.out.print("""
                                |--------------------- Невірно введені дані --------------------------------------------------|
                                |                     Доступні варіанти вводу:                                                |
                                |           1. Число (Для проведення подальших обчислень)                                     |
                                |           2. "="                                                                            |
                                |                          2.1 Вивести результат                                              |
                                |                          2.2 Зберегти обчислення в історію                                  |
                                |                          2.3 Завершити обчислення виразу                                    |
                                |                                                                                             |
                                |                          Помітка: Результат не виводиться якщо не були проведені обчислення |
                                |---------------------------------------------------------------------------------------------|
                                """);
                        break;
                    }
                    typeOfInputValue = TypeOfInputValue.OPERATION;
                }

            } while (true);
            if (operation.equals("=")) {
                System.out.println("......ФІНАЛЬНИЙ РЕЗУЛЬТАТ......: " + result);
            }
            expression.delete(0, expression.length());
        } while (getUserAnswer().matches("[sS]"));
        System.out.println("----Good bye----");
    }

    /**
     * Метод для зчитування значень з клавіатури
     */
    private static void getValue() {
        Scanner scanner = new Scanner(System.in);
        switch (typeOfInputValue) {
            case OPERATION -> {
                System.out.print("Print operation...-> ");
                operation = scanner.nextLine().trim();
            }
            case OPERAND -> {
                System.out.print("Print number......-> ");
                operand = scanner.nextLine().trim();
            }
        }
    }

    /**
     * Метод для перевірки коректності введеної операції
     * @return true - операція коректна, false - операція некоректна
     */
    private static boolean isOperationCorrect() {
        return operation.matches("[+\\-*/]");
    }

    /**
     * Метод для перевірки коректності введеного числа
     * @return true - число коректне, false - число некоректне
     */
    private static boolean isOperandCorrect() {
        return operand.matches("[0-9]+([,.])?[0-9]*");
    }

    /**
     * Метод для обрахунку операцій та зберігання поточних обчислень
     */
    private static void calculate() {
        switch (operation) {
            case "+" -> {
                result += nextOperand;
                expression.append(" + ");
            }
            case "-" -> {
                result -= nextOperand;
                expression.append(" - ");
            }
            case "*" -> {
                result *= nextOperand;
                expression.append(" * ");
            }
            case "/" -> {
                result /= nextOperand;
                expression.append(" / ");
            }
        }
        expression.append(nextOperand);
    }

    /**
     * Метод для перевірки на правильність відповіді користувача
     * про те чи хоче він продовжити виконання калькулятора
     * @return true - користувач дав валідну відповідь
     *         false - користувач дав невалідну відповідь
     */
    private static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        do {
            System.out.print("Press 'q' to exit or press 's' to start again -> ");
            userAnswer = scanner.nextLine();
            if (userAnswer.matches("\\s*([sS]|[qQ])\\s*")) {
                break;
            } else {
                System.out.print("""
                        |-----------------------|
                        |    Unknown command    |
                        |-----------------------|
                        """);
            }
        } while (true);
        return userAnswer.trim();
    }

    /**
     * Метод для приведення калькулятора до початкового стану
     * Після виконання цього методу калькулятор готовий почати роботу з початку
     */
    private static void rollBack() {
        result = 0;
        nextOperand = 0;
        operation = "";
        isFirstOperand = true;
        typeOfInputValue = TypeOfInputValue.OPERAND;
    }

    /**
     * Метод для збереження історії обчислень
     */
    private static void saveToHistory() {
        history.add(expression.append(" = ").append(result).toString());
    }

    /**
     * Метод для відображення історії обчислень
     */
    private static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("----History is empty----");
        } else {
            System.out.println("\n    --------HISTORY--------");
            for (int i = 0; i < history.size(); i++) {
                System.out.println("    " + (i + 1) + ") " + history.get(i));
            }
            System.out.println();
        }
    }

    /**
     * Enum, що відображає тип значення яке вводить користувач
     * OPERATION - операція
     * OPERAND - число
     */
    private enum TypeOfInputValue {
        OPERATION,
        OPERAND
    }
}
