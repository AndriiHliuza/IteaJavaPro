package com.itea.andrii.lecture16.lesson16;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<>() {
            {
                add(new AudioChannel(771));
                add(new AudioChannel(883));
                add(new AudioChannel(550));
                add(new AudioChannel(337));
                add(new AudioChannel(442));
            }
        };

        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);

        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
