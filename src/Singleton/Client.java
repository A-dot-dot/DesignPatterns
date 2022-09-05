package Singleton;

public class Client {
    public static void main(String[] args) {
        var producer = ProducerEagerSingleton.getProducer();
        var con1 = new Consumer(1, producer);
        var con2 = new Consumer(2, producer);

        producer.start();
        con1.start();
        con2.start();

    }
}
