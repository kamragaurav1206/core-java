package threads.communication;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        producerThread.start();
    }
}
