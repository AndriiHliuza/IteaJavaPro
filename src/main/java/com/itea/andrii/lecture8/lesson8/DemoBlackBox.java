package com.itea.andrii.lecture8.lesson8;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        BlackBox object3 = new BlackBox(5, 10);
        BlackBox object4 = object3;

        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode() == object2.hashCode());

        System.out.println(object3.equals(object4));
        System.out.println(object3.hashCode() == object4.hashCode());

        System.out.println(object1.hashCode());
    }
}
