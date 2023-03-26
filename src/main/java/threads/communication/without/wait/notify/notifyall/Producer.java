package threads.communication.without.wait.notify.notifyall;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{

    public List<Integer> sharedQueue ;
    public boolean isProducing = true;

    public Producer() {
        this.sharedQueue = new ArrayList<>();
    }

    @Override
    public void run() {
        System.out.println("Producer producing");
        for (int i = 1; i <= 10; i++) {
                sharedQueue.add(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
        }
        isProducing=false;
    }
}
