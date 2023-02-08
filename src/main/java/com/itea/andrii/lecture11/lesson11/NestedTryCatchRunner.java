package com.itea.andrii.lecture11.lesson11;

public class NestedTryCatchRunner {
    public void doAction() {
        try {
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = "  +a);
            try {
                int b = 1 / a;
                StringBuilder sb = new StringBuilder(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("недопустимий розмір буфера: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("ділення на 0: " + e);
        }
    }

    public static void main(String[] args) {
        new NestedTryCatchRunner().doAction();
    }
}
