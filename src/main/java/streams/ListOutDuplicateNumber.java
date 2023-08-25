package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ListOutDuplicateNumber {
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

        Set<Integer> duplicateValues1 = list.stream().filter((e)-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
        duplicateValues1.forEach(System.out::println);
        System.out.println("Second way");
        Set<Integer> duplicateValues2 = new HashSet<>();
        list.stream().filter(e->!duplicateValues2.add(e)).collect(Collectors.toSet()).forEach(System.out::println);

    }
}
