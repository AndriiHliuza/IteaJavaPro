package com.itea.andrii.lecture9.lesson9;

public class Runner {
    public static void main(String[] args) {
        TeacherLogic teacherLogic = new TeacherLogic();
        teacherLogic.excludeProcess(777, "Bob");
        teacherLogic.excludeProcess(6, "Bob");
    }
}
