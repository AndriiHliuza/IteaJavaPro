package com.itea.andrii.lecture11.lesson11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ConcreteResource extends Resource {
    public ConcreteResource(String filename) throws FileNotFoundException {
        super(filename);
    }


    public ConcreteResource() throws IOException {
        super("file.txt");
    }

//    public ConcreteResource(String name, int mode) {
//        super(name);
//    }

    public ConcreteResource(String name, int mode, String type) throws ParseException, IOException {
        super(name);
    }

    public static void main(String[] args) throws ParseException, IOException {
        ConcreteResource concreteResource = new ConcreteResource("efnk", 23, "jdnf");
    }
}
