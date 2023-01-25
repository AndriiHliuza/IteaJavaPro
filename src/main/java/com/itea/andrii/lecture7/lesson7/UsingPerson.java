package com.itea.andrii.lecture7.lesson7;

import java.util.Arrays;

public class UsingPerson {
    public UsingPerson() {
        Person[] people = new Person[3];
        people[2] = new Person("Перебийніс", "Василь");
        people[0] = new Person("Козаченко", "Петро");
        people[1] = new Person("Назаренко", "Іван");

        Arrays.sort(people);

        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        new UsingPerson();
    }
}
