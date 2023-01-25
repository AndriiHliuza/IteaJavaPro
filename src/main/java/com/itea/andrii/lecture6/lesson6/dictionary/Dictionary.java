package com.itea.andrii.lecture6.lesson6.dictionary;

public class Dictionary implements Dict {
    private String[] ukWord = {"слово", "читати", "сонце", "робити", "йти"};
    private String[] enWord = {"word", "read", "sun", "do", "go"};
    @Override
    public boolean addWord(String word, String translation) {
        return false;
    }

    @Override
    public boolean delWord(String word) {
        return false;
    }

    @Override
    public String findTranslation(String word) {
        for (int i = 0; i < ukWord.length; i++) {
            if (ukWord[i].equalsIgnoreCase(word)) {
                return enWord[i];
            }
            if (enWord[i].equalsIgnoreCase(word)) {
                return ukWord[i];
            }
        }
        return ">>Переклад не знайдено!!!<<";
    }
}
