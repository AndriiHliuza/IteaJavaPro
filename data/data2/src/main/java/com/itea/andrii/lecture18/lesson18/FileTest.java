package com.itea.andrii.lecture18.lesson18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        var fp = new File("src/main/java/com/itea/andrii/lecture18/lesson18/Test.java");

        if (fp.exists()) {
            System.out.println("File " + fp.getName() + " - exists");

            if (fp.isFile()) {
                System.out.println("Path to file: \t" + fp.getPath());
                System.out.println("Абсолютний шлях: " + fp.getAbsolutePath());
                System.out.println("Розмір файлу: " + fp.length());
                System.out.println("Остання модифікація: " + new Date(fp.lastModified()));
                System.out.println("Файл доступний для читання: " + fp.canRead());
                System.out.println("Файл доступний для запису: " + fp.canWrite());
                System.out.println("Файл доступний для виконання: " + fp.canExecute());
                System.out.println("Файл видалений: " + fp.delete());
            }
        } else {
            System.out.println("File: " + fp.getName() + " does not exist");
        }

        try {
            if (fp.createNewFile()) {
                System.out.println("File " + fp.getName() + " created");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        var dir = new File("src/main/java/com/itea/andrii/lecture18/lesson18");

        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Directory " + dir.getName() + " - exists");
            File[] files = dir.listFiles();

            for (var file : files) {
                var date = new Date(file.lastModified());
                System.out.println("\n" + file.getPath() + "\t |" + file.length() + "\t |" + date);
            }
        }

        File[] roots = File.listRoots();

        if (roots != null) {
            for (var root : roots) {
                System.out.printf("\n | %s | %d | from | %d | free |", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
            }
        } else {
            System.out.println("There are no roots");
        }
    }
}
