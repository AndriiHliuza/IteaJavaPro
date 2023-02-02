package com.itea.andrii.lecture9.lesson9;

public class Ship {
    private Engine eng;
    protected int a;
    //private static int f = Engine.g;

    public class Engine {
        protected int b;
       // private static int g = 4;
        public void launch() {
            System.out.println("Запуск двигкна");
        }
    }


    public final void init() {
        eng = new Engine();
        eng.launch();
    }
}
