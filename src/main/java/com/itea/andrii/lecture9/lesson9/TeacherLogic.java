package com.itea.andrii.lecture9.lesson9;

public class TeacherLogic {
    public void excludeProcess(int rectorId, String studentName) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Студент: " + studentName + " відрахований: " + teacher.excludeStudent(studentName));
    }
}
