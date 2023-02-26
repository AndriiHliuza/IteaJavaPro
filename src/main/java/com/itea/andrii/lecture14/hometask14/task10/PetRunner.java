package com.itea.andrii.lecture14.hometask14.task10;

import com.itea.andrii.lecture14.hometask14.task1_8.Main;

import java.util.HashMap;
import java.util.Map;

public class PetRunner {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Tom", new Cat());
        pets.put("Brubo", new Dog());
        pets.put("Gosha", new Parrot());
        pets.put("Charlie", new Dog());
        Main.printKeys(pets);
    }
}
