package com.itea.andrii.lecture5.hometask5;

public class Person {
    private String name;
    private String surname;
    private int age;
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printPersonInformation() {
        System.out.println("Ім'я: " + name + "\n" +
                "Прізвище: " + surname + "\n" +
                "Вік: " + age);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            throw new RuntimeException("Invalid age");
        }
    }
}
