package com.itea.andrii.lecture15.lesson15;

public class WalkTalk {
    public static void main(String[] args) {
        System.out.println("start main");

        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        talk.start();
        walk.start();

        System.out.println("finish main");
    }
}
