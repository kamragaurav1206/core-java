package streams;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(a->a%2==0).forEach(System.out::println);
        System.out.println("----------");
        list.stream().filter(a->a%2==0).map(a->a+a).forEach(System.out::println);
    }
}
