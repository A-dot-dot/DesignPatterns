package Observer;

public class Consumer implements Observer{
    Producer producer;

    Consumer(Producer producer) {
        this.producer = producer;
        register();
    }

    void register() {
        producer.register(this);
    }

    void unregister() {
        producer.unRegister(this);
    }
    @Override
    public void update() {
        System.out.println("Update received by " + producer.getCounter());
    }
}
