package com.itea.andrii.lecture15.lesson15;

public class SyncThread extends Thread {
    private Resource resource;

    public SyncThread(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.writing(getName(), i);
        }
    }
}
