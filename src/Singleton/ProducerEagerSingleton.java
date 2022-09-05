package Singleton;

import java.util.Random;

// Implemented with Eager Initialization

public class ProducerEagerSingleton implements Runnable{
    private static final ProducerEagerSingleton producer = new ProducerEagerSingleton();
    private Thread t;
    private Random random;
    private int item;
    private ProducerEagerSingleton() {
        System.out.println("Created ProducerEagerSingleton.");
        t = new Thread(this, "ProducerEagerSingleton-1");
        random = new Random();
    }

    static ProducerEagerSingleton getProducer() {
        return producer;
    }

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

    public int getItem() {
        return item;
    }

    void start() {
        t.start();
    }
}
