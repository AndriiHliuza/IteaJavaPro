package com.itea.andrii.lecture8.lesson8;

import java.util.Objects;

public class HashCodeConcept {
    public static void main(String[] args) {
        Simpson homer = new Simpson(1, "Homer");
        Simpson bart = new Simpson(2, "Bart");

        boolean isHashCodeEquals = homer.hashCode() == bart.hashCode();

        if (isHashCodeEquals) {
            System.out.println("Слід порівняти методом equals");
        } else {
            System.out.println("Не слід порівнювати методом equals");
        }
    }

    static class Simpson {
        private int id;
        private String name;

        public Simpson(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Simpson simpson = (Simpson) o;
            return id == simpson.id && Objects.equals(name, simpson.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
