package com.itea.andrii.lecture18.hometask18.task10;

import com.itea.andrii.lecture18.hometask18.FileChanger;

public class Main {
    public static void main(String[] args) {
        FileChanger fileChanger = new FileChanger("src/main/java/com/itea/andrii/lecture18/hometask18/task10/task10.txt");
        fileChanger.changeLastAndFirstWordOFTheLine();
    }
}