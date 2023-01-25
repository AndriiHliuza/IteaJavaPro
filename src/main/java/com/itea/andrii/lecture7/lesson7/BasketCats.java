package com.itea.andrii.lecture7.lesson7;

import java.io.*;

public class BasketCats {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat vaska = new Cat("Vaska", "Gray", 4, new Person("Ivan", "Petrov"));

        Person person1 = new Person("John", "Biden");
        Person person2 = new Person("John", "Biden");

        Cat cat1 = new Cat("Tom", "red", 2, person1);
        Cat cat2 = new Cat("Tom", "red", 2, person2);
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        ous.writeObject(vaska);
        ous.close();


        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        Cat cloneVaska = (Cat) ois.readObject();
        System.out.println(vaska);
        System.out.println(cloneVaska);
        System.out.println("************************");
        cloneVaska.setColor("Black");
        cloneVaska.getPerson().setSurName("Biden");
        System.out.println(vaska);
        System.out.println(cloneVaska);
    }
}
