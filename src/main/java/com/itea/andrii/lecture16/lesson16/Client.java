package com.itea.andrii.lecture16.lesson16;

public class Client extends Thread {
    private boolean reading;
    private ChannelPool<AudioChannel> pool;

    public Client(ChannelPool<AudioChannel> pool) {
        this.pool = pool;
    }


    @Override
    public void run() {
        AudioChannel channel = null;

        try {
            channel = pool.getResource(100);
            reading = true;
            System.out.println("Channel Client #" + getId() + " took channel #" + channel.getChannelId());
            channel.using();
        } catch (ResourceException e) {
            System.out.println("Client #" + getId() + " lost ->" + e.getMessage());
        } finally {
            if (channel != null) {
                reading = false;
                System.out.println("Channel Client #" + getId() + " : " + channel.getChannelId() + " channel released");
                pool.returnResource(channel);
            }
        }
    }

    public boolean isReading() {
        return reading;
    }
}
