package com.itea.andrii.lecture4.lesson4;

public class Safe {
    double width;
    double height;
    double depth;
    double safeVolume;

    Safe (double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getSafeVolume() {
        return width * height * depth;
    }
}
