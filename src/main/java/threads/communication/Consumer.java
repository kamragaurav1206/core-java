package threads.communication;

public class Consumer implements Runnable{

    Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        synchronized (this.producer){
            System.out.println("Consumer is waiting");
            try {
                this.producer.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.producer.sharedQueue.size());
        System.out.println("----------------------");
        this.producer.sharedQueue.forEach(System.out::println);
        System.out.println("----------------------");
        int size =this.producer.sharedQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Consumer is consuming ::"+i+" :: "+this.producer.sharedQueue.remove(0));
        }

    }
}
