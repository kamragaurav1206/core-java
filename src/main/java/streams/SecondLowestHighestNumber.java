package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(23);
        list.add(123);
        list.add(234);
        list.add(44);
        list.add(63);
        list.add(93);

        int secondLowestHighestNumber=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLowestHighestNumber);

    }
}
