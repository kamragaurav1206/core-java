package threads.communication.without.wait.notify.notifyall;


public class ProducerConsumer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        Thread prodThread = new Thread(producer);
        Thread consThread = new Thread(consumer);
        //prodThread.start();
        consThread.start();
        prodThread.start();
    }
}
