package Observer;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();

        Consumer consumer1 = new Consumer(producer);
        Consumer consumer2 = new Consumer(producer);

        try {
            producer.init();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
