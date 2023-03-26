package collections.set;

import java.util.IdentityHashMap;

public class MyIdentityHashMap {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        Integer integer1 = new Integer(10);
        IdentityHashMap identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(integer1,"Sample");
        identityHashMap.put(integer,"Sample1");
        System.out.println(identityHashMap);


    }
}
