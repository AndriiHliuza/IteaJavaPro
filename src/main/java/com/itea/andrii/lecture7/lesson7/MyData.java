package com.itea.andrii.lecture7.lesson7;

public interface MyData {
    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("Клас MyData. Друкуємо стрічку: " + str);
        }
    }

    static boolean isNull(String str) {
        System.out.println("Статичний метод перевірки на null");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
