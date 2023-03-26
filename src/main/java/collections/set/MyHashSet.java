package collections.set;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add(null);
        hashSet.add("xyz");
        hashSet.add("bbc");
        System.out.println(hashSet);
    }
}
