package Singleton;

import java.util.Random;

public class ProducerLazySingelton implements Runnable {
    volatile private static ProducerLazySingelton producer;
    private Thread t;
    private Random random;
    private int item;

    private ProducerLazySingelton() {
        System.out.println("Created ProducerLazySingelton.");
        t = new Thread(this, "ProducerLazySingelton");
        random = new Random();
    }

    static ProducerLazySingelton getProducer() {
        if (producer == null) {
            synchronized (ProducerLazySingelton.class) {
                if (producer == null) {
                    producer = new ProducerLazySingelton();
                }
            }
        }

        return producer;
    }


    @Override
    public void run() {
        while (true) {
            item = random.nextInt(0, 23);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void start() {
        t.start();
    }

    public int getItem() {
        return item;
    }
}

