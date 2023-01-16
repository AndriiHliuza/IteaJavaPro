package com.itea.andrii.lecture4.lesson4;

public class ObjectFieldsInitOrder {
    static int initialize(String message) {
        System.out.println(message);
        return 0;
    }


    static class A {
        int i0 = initialize("i0");
        static int b = 10;

        int c = b;

        int d = 20;
        int i1;
        {
            i1 = initialize("i1");
        }

        int i2 = initialize("i2");

        int i3;
        A() {
            i3 = initialize("i3");
        }
    }

    static class B extends A {
        int i4 = initialize("i4");
        int i5;
        {
            i5 = initialize("i5");
        }

        int i6;

        B() {
            i6 = initialize("i6");
        }
    }

    public static void main(String[] args) {
        System.out.println("start in main");
        new B();
    }


}
