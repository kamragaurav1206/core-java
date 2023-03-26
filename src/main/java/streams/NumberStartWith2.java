package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(23);
        list.add(123);
        list.add(234);
        list.add(44);
        list.add(44);
        list.add(63);
        list.add(93);
        list.add(93);
        list.add(3);
        list.add(77);
        list.add(309);
        list.add(109);
        list.add(77);
        list.add(27);
        list.add(224);
        list.stream().distinct().map(e->String.valueOf(e)).filter(s->s.startsWith("2")).collect(Collectors.toList()).forEach(System.out::println);

    }
}
