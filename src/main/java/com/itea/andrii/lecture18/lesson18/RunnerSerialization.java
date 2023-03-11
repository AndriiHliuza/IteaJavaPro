package com.itea.andrii.lecture18.lesson18;

import java.io.File;
import java.io.InvalidObjectException;

public class RunnerSerialization {
    public static void main(String[] args) {
//        Student student = new Student("MMF", "Goncharenko", 1, "G017s9");
//        System.out.println(student);
//        System.out.println(student.address);

        var filePath = "data" + File.separator + "demo.data";

        var serializator = new Serializator();
//        var result = serializator.serialization(student, filePath);

        Student.faculty = "GEO";

        Student res = null;

        try {
            res = serializator.deserialization(filePath);
            System.out.println(res.address);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

        System.out.println(res);
    }
}
