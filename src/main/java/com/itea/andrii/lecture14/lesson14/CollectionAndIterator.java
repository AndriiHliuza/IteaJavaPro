package com.itea.andrii.lecture14.lesson14;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionAndIterator {
    public static void main(String[] args) {
        Collection<String> coll = new Vector<>();
        coll.add("Collection");
        coll.add("Queue");
        coll.add("List");
        coll.add("Map");

        System.out.println("Size: " + coll.size());

        Iterator<String> ite = coll.iterator();
        System.out.println(coll);
        ite.next();
        ite.remove();
        System.out.println(coll);
        

        while (ite.hasNext()) {
            String s = ite.next();
            System.out.println("Element: " + s);
        }
    }
}
