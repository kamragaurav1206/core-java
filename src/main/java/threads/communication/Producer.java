package threads.communication;

import java.util.ArrayList;

public class Producer implements Runnable{

    ArrayList<Integer> sharedQueue;

    public Producer() {
        this.sharedQueue = new ArrayList<>();
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Producer is producing::");
            for (int i = 1; i < 10; i++) {
                sharedQueue.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Still Producing "+i);
            }
            this.notify();
        }

    }
}
