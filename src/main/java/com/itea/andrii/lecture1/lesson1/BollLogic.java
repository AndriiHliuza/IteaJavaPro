package com.itea.andrii.lecture1.lesson1;

public class BollLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


        int r = 10, k = 2;

        if (k != 0 && r % k == 0) {
            System.out.println("r поділено на k без залишку");
        }

        int x  = 0;
        int y = x == 0 ? ++x : x;

        System.out.println(x);
        System.out.println(y);
    }
}
