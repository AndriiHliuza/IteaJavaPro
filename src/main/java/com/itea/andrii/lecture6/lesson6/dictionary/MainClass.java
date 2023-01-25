package com.itea.andrii.lecture6.lesson6.dictionary;

public class MainClass {
    WordTranslator wordTranslator;
    Dictionary dictionary;

    public MainClass() {
        dictionary = new Dictionary();
        wordTranslator = new WordTranslator(dictionary);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
