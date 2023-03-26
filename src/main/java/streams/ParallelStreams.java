package streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");
        list.parallelStream().forEach(System.out::println);
        System.out.println("-------------------");
        list.parallelStream().forEachOrdered(System.out::println);



    }
}
