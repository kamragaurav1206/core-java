package threads.communication.without.wait.notify.notifyall;


public class Consumer implements Runnable{

    Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while(this.producer.isProducing){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
        }
        int size = this.producer.sharedQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Consumer consuming "+this.producer.sharedQueue.remove(0));
        }
    }
}
