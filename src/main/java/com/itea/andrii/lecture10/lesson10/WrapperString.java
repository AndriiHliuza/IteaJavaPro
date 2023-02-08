package com.itea.andrii.lecture10.lesson10;

public class WrapperString {
    private String str;

    public WrapperString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String replace(char oldChar, char newChar) {
        char[] array = new char[str.length()];
        str.getChars(0, str.length(), array, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar) {
                array[i] = newChar;
                break;
            }
        }

        return new String(array);
    }
}
