package com.itea.andrii.lecture11.lesson11;

public class Runner {
    public static void main(String[] args) {
        SameResource f = new SameResource();
        try {
            Connector.loadResource(f);
        } catch (IllegalResourceException e) {
            System.err.println("обробка unchecked-виключення поза методу: " + e);
        } finally {
            System.out.println("by");
        }
        System.out.println("hi");
    }
}
