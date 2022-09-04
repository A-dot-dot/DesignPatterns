package Singleton;

import java.util.Random;

// Implemented with Eager Initialization

public class Producer implements Runnable{
    private static final Producer producer = new Producer();
    private Thread t;
    private Random random;

    private int item;

    @Override
    public void run() {
        while(true) {
            item = random.nextInt(0, 23);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static Producer getProducer() {
        return producer;
    }


    private Producer() {
        System.out.println("Created producer.");
        t = new Thread(this, "Producer-1");
        random = new Random();
    }

    public int getItem() {
        return item;
    }

    void start() {
        t.start();
    }
}
