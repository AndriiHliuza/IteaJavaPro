package com.itea.andrii.lecture7.lesson7;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Serializable {
    private String name;
    private transient String color;
    private int age;
    private Person person;

    public Cat(String name, String color, int age, Person person) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.person = person;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color) && Objects.equals(person, cat.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, person);
    }
}
