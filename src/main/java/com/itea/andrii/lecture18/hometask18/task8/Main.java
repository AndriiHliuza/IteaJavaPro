package com.itea.andrii.lecture18.hometask18.task8;

import com.itea.andrii.lecture18.hometask18.JavaClassChanger;

public class Main {
    public static void main(String[] args) {
        JavaClassChanger javaClassChanger = new JavaClassChanger("src/main/java/com/itea/andrii/lecture18/hometask18/Student.java");
        javaClassChanger.removeRedundantSpaces();
    }
}