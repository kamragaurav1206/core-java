package threads;


import java.util.stream.IntStream;

public class JoinDemo {
    static Runnable runnable =()-> IntStream.rangeClosed(0,100).forEach((s)->{
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
        System.out.println("child"+s);
    } );

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
       // thread.join();
        IntStream.rangeClosed(0,6).forEach((s)->{
            System.out.println("main"+s);
        } );
    }

}
