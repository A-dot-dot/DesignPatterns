package Singleton;

import java.util.Random;

public class ProducerSingleton implements Runnable{
    private Thread t;
    
    private static ProducerSingleton producer;
    private Random random;

    private int item;
    
    ProducerSingleton(String name) {
        t = new Thread(this, name);
    }

    static ProducerSingleton getProducer() {
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
