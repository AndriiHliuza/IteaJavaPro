package com.itea.andrii.lecture15.lesson15;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;

public class Resource implements Closeable {
    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }

    public void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            Thread.sleep((long) (Math.random() * 50));
            fileWriter.append("->" + i + " ");
            System.out.print("->" + i + " ");
        } catch (IOException e) {
            System.err.println("Помилка файлу: " + e);
        } catch (InterruptedException e) {
            System.err.println("Помилка потоку: " + e);
        }
    }

    @Override
    public void close(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Помилка закриття файлу: " + e);
        }
    }
}
