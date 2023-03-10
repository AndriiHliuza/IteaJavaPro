package com.itea.andrii.lecture14.lesson14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.offer("E");
        names.offer("A");
        names.offer("M");
        names.add("G");
        names.add("B");

        while (true) {
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name = " + name);
        }
    }
}
