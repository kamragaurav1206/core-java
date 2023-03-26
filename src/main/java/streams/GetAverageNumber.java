package streams;

import java.util.ArrayList;
import java.util.List;

public class GetAverageNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        double d=list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(d);

    }
}
