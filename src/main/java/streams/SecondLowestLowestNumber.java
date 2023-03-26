package streams;

import java.util.ArrayList;
import java.util.List;

public class SecondLowestLowestNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(123);
        list.add(234);
        list.add(44);
        list.add(63);
        list.add(93);
        list.add(3);

        System.out.println(list.stream().sorted().skip(1).findFirst().get());
    }
}
