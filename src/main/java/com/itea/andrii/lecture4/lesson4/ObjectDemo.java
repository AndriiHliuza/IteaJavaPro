package com.itea.andrii.lecture4.lesson4;

public class ObjectDemo {
    static String classField = "Hello";
    {
        classField = "gtgt";
    }
    String objectField = "Hello";
    public static void main(String[] args) {
        String newStr = ObjectDemo.classField;

        ObjectDemo objectDemo = new ObjectDemo();
        String newStr2 = objectDemo.objectField;
    }
}
