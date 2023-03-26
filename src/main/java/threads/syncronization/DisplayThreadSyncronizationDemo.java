package threads.syncronization;

class DisplayThread extends Thread{
    private String name;
    private Display display;

    public DisplayThread(String name, Display display) {
        this.name = name;
        this.display = display;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}
public class DisplayThreadSyncronizationDemo {
    public static void main(String[] args) {
        // call wish method using single object(display)
        Display display =new Display();
        DisplayThread gaurav = new DisplayThread("Gaurav",display);
        DisplayThread sourabh = new DisplayThread("Sourabh",display);
        //gaurav.start();
        //sourabh.start();

        //call wish method using two different display object
        Display display1 =new Display();
        Display display2 =new Display();
        DisplayThread gaurav_k = new DisplayThread("Gaurav",display1);
        DisplayThread sourabh_k = new DisplayThread("Sourabh",display2);
        gaurav_k.start();
        sourabh_k.start();
    }
}
