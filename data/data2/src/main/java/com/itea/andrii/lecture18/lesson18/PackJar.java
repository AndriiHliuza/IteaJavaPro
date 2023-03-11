package com.itea.andrii.lecture18.lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {
    public static final int BUFFER = 2_048;
    public static final String NOT_FOUND = " not found";

    public String jarFileName;

    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }

    public void pack(String dirName) throws FileNotFoundException {
        File dir = new File(dirName);

        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + NOT_FOUND);
        }
        File[] files = dir.listFiles();
        ArrayList<String> listFilesToJar = new ArrayList<>();

        for (File file : files) {
            if (!file.isDirectory()) {
                listFilesToJar.add(file.getPath());
                System.out.println(file.getPath());
            }
        }

        String[] temp = {};
        String[] filesToJar = listFilesToJar.toArray(temp);

        try (FileOutputStream fos = new FileOutputStream(jarFileName);
             JarOutputStream jos = new JarOutputStream(fos)) {
            byte[] buffer = new byte[BUFFER];

            jos.setLevel(Deflater.DEFAULT_COMPRESSION);

            for (String file : filesToJar) {
                jos.putNextEntry(new JarEntry(file));

                try (FileInputStream in = new FileInputStream(file)) {
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        jos.write(buffer, 0, len);
                    }
                    jos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("File not found: " + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Некоректний аргумент: " + e);
        } catch (IOException e) {
            System.err.println("Помилка доступу: " + e);
        }
    }
}
