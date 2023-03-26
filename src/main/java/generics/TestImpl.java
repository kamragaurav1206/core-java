package generics;

public class TestImpl {
    Test<String> stringTest = new Test<>("Hello");
    Test<Integer> integerTest = new Test<>(10);

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        test.integerTest.print();
        test.integerTest.printClassType();
        test.stringTest.print();
        test.stringTest.printClassType();
    }
}
