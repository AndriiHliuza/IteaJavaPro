package com.itea.andrii.lecture18.lesson18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) {
        try (var br = new BufferedReader(new FileReader("data" + File.separator + "res.txt"))) {
            var tmp = "";

            while ((tmp = br.readLine()) != null) {
                var strings = tmp.split("\\s");

                for (var str : strings) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
