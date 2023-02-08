package com.itea.andrii.lecture11.lesson11;

public class Connector {
    public static void loadResource(SameResource f) throws IllegalResourceException {
        if (f == null || !f.isCreate()) {
            throw new IllegalResourceException();
        }
    }
}
