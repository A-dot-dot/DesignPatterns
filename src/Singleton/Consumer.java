package Singleton;

public class Consumer implements Runnable{
    private final int consumerId;
    final Thread t;

    private final ProducerEagerSingleton producer;

    Consumer(int consumerId, ProducerEagerSingleton producer) {
        this.consumerId = consumerId;
        this.producer = producer;

        t = new Thread(this, "Consumer" + consumerId);
        System.out.println("Created a new consumer " + consumerId);
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("Consumer" + consumerId + " consumed " + producer.getItem());

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


}
