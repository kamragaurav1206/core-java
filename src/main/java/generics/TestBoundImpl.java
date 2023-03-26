package generics;

import java.util.ArrayList;

public class TestBoundImpl {
    public static void main(String[] args) {
        TestBound<Integer> integerTestBound  = new TestBound<Integer>(111);
        integerTestBound.print();

    }
}
