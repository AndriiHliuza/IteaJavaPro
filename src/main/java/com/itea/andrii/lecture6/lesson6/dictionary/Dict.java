package com.itea.andrii.lecture6.lesson6.dictionary;

public interface Dict {
    boolean addWord(String word, String translation);
    boolean delWord(String word);
    String findTranslation(String word);
}
