package com.itea.andrii.lecture14.lesson14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(10, 0.8f);

        set.add("One");
        set.add("Two");
        set.add("One");
        set.add("Three");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
