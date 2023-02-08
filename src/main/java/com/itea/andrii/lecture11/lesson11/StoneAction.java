package com.itea.andrii.lecture11.lesson11;

import java.text.ParseException;

public class StoneAction {
    public void buildHouse(Stone stone) {
        try {
            stone.build("some info");
        } catch (ParseException e) {
            System.err.println(e);
        }
    }
}
