package com.itea.andrii.lecture4.lesson4;

public class ClassFieldsInitOrder {
    static int i1 = initialize("i1");

    static int i2;

    static {
        i2 = initialize("i2");
    }

    static int i3 = initialize("i3");

    static int i4;
    static {
        i4 = initialize("i4");
    }
    static int initialize(String name) {
        System.out.println(name);
        return 0;
    }

    public static void main(String[] args) {

    }
}
