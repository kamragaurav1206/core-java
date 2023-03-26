package collections.list;

import java.util.LinkedList;
import java.util.SortedSet;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hello");
        System.out.println(list);
        list.addFirst(30);
        System.out.println(list);
        list.add(null);
        System.out.println(list);
        list.set(2,"Hi");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
