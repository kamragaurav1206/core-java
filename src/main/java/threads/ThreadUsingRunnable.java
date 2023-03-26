package threads;

import java.util.stream.IntStream;

public class ThreadUsingRunnable {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            IntStream.rangeClosed(0,5).forEach((s)->System.out.println("runnable Counting :"+s));
        };
        Thread thread = new Thread(runnable);
        //Thread.currentThread().setPriority(10); //thread priority is not working as expected
        thread.start();
        //System.out.println(thread.getPriority());
        //System.out.println(Thread.currentThread().getPriority());
        thread.setPriority(10);
        IntStream.rangeClosed(0,5).forEach((s)->System.out.println("Main Method :"+s));
    }
}
