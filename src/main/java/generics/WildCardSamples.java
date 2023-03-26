package generics;

import java.util.ArrayList;

public class WildCardSamples {
    //public<T extends Number&Thread> void methodOne(T t){}
    //public<T extends Number&Thread> void methodOne(T t){}

    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<String>();
        ArrayList<?> l2=new ArrayList<String>();//
        ArrayList<?> l3=new ArrayList<Integer>();//
        ArrayList<? extends Number> l4=new ArrayList<Integer>();
        /*ArrayList<? extends Number> l5=new ArrayList<String>();
        ArrayList<?> l6=new ArrayList<? extends Number>();
        ArrayList<?> l7=new ArrayList<?>();*/
    }
}
