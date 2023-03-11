package com.itea.andrii.lecture18.lesson18;

public class UnpackDemo {
    public static void main(String[] args) {
        String nameJar = "./example.jar";
        String destinationPath = "C:\\Users\\Legion\\AndriiHL\\IT\\ITEA\\Java_Pro_26_12_2022\\lesson1\\IteaJavaPro\\data\\data2";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}
