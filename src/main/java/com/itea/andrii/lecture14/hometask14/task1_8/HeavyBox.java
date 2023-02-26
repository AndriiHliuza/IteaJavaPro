package com.itea.andrii.lecture14.hometask14.task1_8;

public class HeavyBox implements Comparable<HeavyBox> {
    private double weight;

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        return (int) (weight - o.weight);
    }
}
