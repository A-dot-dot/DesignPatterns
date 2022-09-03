package Observer;

import java.util.Random;

public class Producer implements Observable{
    private int counter = 0;

    void init() throws InterruptedException {
        while(true) {
            Random random = new Random();
            counter = random.nextInt(0, 10);

            System.out.println("Produced a new value : " + counter);
            update();

            Thread.sleep(1000);
        }
    }


    public int getCounter() {
        return counter;
    }
}
