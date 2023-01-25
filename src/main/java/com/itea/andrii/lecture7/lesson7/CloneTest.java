package com.itea.andrii.lecture7.lesson7;

public class CloneTest {
    static class Person implements Cloneable {
        String name;
        int age;
        Car car;

        public Person(String name, int age, Car car) {
            this.name = name;
            this.age = age;
            this.car = car;
        }

        public Person(Person other) {
            this(other.name, other.age, other.car);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", car=" + car +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Car {
        public String color;

        public Car(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Green");

        Person person = new Person("Mike", 25, car);

        Person clone = (Person) person.clone();
        System.out.println(person);
        System.out.println(clone);
        clone.name = "Ivan";
        clone.car.color = "red";

        System.out.println(person);
        System.out.println(clone);
    }

}
