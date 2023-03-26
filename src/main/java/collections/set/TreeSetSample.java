package collections.set;

import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new StringBuffer("Hello"));
        treeSet.add(new StringBuffer("Hi"));
        treeSet.add(new StringBuffer("Sample"));
        System.out.println(treeSet);

    }
}
