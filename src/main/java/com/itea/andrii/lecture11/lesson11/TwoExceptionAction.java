package com.itea.andrii.lecture11.lesson11;

import com.itea.andrii.lecture11.lesson11.entities.Person;
import com.itea.andrii.lecture11.lesson11.entities.Student;

public class TwoExceptionAction {
    public void doAction() {
        try {
            int a = (int) (Math.random() * 2);

            System.out.println("a = " + a);
            int[] c = {1 / a};
            c[a] = 71;
        } catch (ArithmeticException e) {
            System.err.println("ділення на 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        }

        new Student().hello();

        System.out.println("after try-catch");

    }

    public static void main(String[] args) {
        new TwoExceptionAction().doAction();
    }
}
