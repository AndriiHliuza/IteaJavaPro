package com.itea.andrii.lecture18.lesson18;

import java.io.FileNotFoundException;

public class PackDemo {
    public static void main(String[] args) {
        String dirName = "./src/main/java/com/itea/andrii/lecture18/lesson18";
        PackJar packJar = new PackJar("./example.jar");
        try {
            packJar.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
