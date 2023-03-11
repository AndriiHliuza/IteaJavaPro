package com.itea.andrii.lecture18.lesson18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String filePath = "data" + File.separator + "file.txt";

        File file = new File(filePath);

        int b, count = 0;

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);

            while ((b = fileReader.read()) != -1) {
                System.out.print((char) b);
                count++;
            }
            System.out.println("\nЧисло байтів = " + count);
        } catch (FileNotFoundException e) {
            System.err.println("Помилка файлу: " + e);
        } catch (IOException e) {
            System.err.println("Помилка читання: " + e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.err.println("Помилка закриття файлу: " + e);
            }
        }
    }
}
