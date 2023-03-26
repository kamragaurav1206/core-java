package threads;

import java.util.stream.IntStream;
class MyThread1 implements Runnable{
    @Override
    public void run() {
        //Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println("Child");
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
/*        Runnable runnable = ()->IntStream.range(0,11).forEach((s)->{
            Thread.currentThread().yield();
            System.out.println("Child");
        });*/

        Thread thread = new Thread(new MyThread1());
        Thread.yield();
        thread.start();

      //  IntStream.rangeClosed(0,10).forEach((s)-> System.out.println("Main Method")); //with intstream yield method not working
        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }


}
