package com.itea.andrii.lecture9.hometask9.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mobile {
    private List<Model> models = new ArrayList<>();
    private class Model {
        private String name;
        private int year;
        private int ssdSize;
        private int ram;

        public Model(String name, int year, int ssdSize, int ram) {
            this.name = name;
            this.year = year;
            this.ssdSize = ssdSize;
            this.ram = ram;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Model model = (Model) o;
            return year == model.year && ssdSize == model.ssdSize && ram == model.ram && Objects.equals(name, model.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, year, ssdSize, ram);
        }

        @Override
        public String toString() {
            return "Model{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", ssdSize=" + ssdSize +
                    ", ram=" + ram +
                    '}';
        }
    }

    public boolean addModel(String name, int year, int ssdSize, int ram) {
        Model model = new Model(name, year, ssdSize, ram);
        return !models.contains(model) && models.add(model);
    }


    public void showAllModels() {
        models.forEach(System.out::println);
    }
}
