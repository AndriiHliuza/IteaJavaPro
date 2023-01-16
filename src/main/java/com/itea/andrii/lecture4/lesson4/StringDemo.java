package com.itea.andrii.lecture4.lesson4;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("This is string line, \nand this a new line");

        String test = "test";
        test = "hello";
        System.out.println(test);

        String newStr = test.concat(" world");
        System.out.println(newStr);
        System.out.println(newStr.length());

        String s = test.substring(0, 3);
        System.out.println(s);
        System.out.println(test.substring(3));

        String str1 = "Hello";
        String str2 = "Hello";
        if (str1 == str2) {
            System.out.println("рівні");
        } else {
            System.out.println("не рівні");
        }

        String greeting = "Hello!\uD83D\uDE00";
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println("cpCount = " + cpCount);

        System.out.println(greeting.charAt(6));
        System.out.println(greeting.codePointAt(6));

        greeting = "hello 726 8723 0480 28";
        System.out.println(greeting.matches("[0-9]+"));
        System.out.println(greeting.replace("l", "L"));

        System.out.println(greeting.replaceAll("[0-9]+", "new"));

        String[] arrays = greeting.split(" ");
        System.out.println(Arrays.toString(arrays));

        greeting = "Hello World";
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        StringBuilder builder = new StringBuilder();

        builder.ensureCapacity(30);
        builder.append("Hello");
        builder.append(" ").append("world");
        builder.append('!');

        System.out.println(builder);
        String fromBuilder = builder.toString();
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        builder.setLength(30);
        builder.append("hi");
        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.capacity());
    }
}
