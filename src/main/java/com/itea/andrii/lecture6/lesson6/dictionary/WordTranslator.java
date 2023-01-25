package com.itea.andrii.lecture6.lesson6.dictionary;

import java.util.Scanner;

public class WordTranslator {
    Dict dict;

    public WordTranslator(Dict dict) {
        this.dict = dict;
        Scanner scanner = new Scanner(System.in);

        String word;

        while (true) {
            System.out.print("Введіть слово для перекладу: (ext - вихід) ");
            word = scanner.next();

            if (word.equalsIgnoreCase("ext")) {
                break;
            }

            System.out.println(" - " + dict.findTranslation(word));
        }
    }
}
