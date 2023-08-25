package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/*
In Java 8, BinaryOperator is a functional interface
and it extends BiFunction .
The BinaryOperator takes two arguments of the same
type and returns a result of the same type of its arguments.
The BiFunction takes two arguments of any type, and returns a result of any type.
 */
public class ReduceSample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("def");
        stringList.add("abc");
        stringList.add("xyz");
        BinaryOperator<String> binaryOperator = (s,y)->{

            return s+"----"+y;
        };

        stringList.stream().sorted().reduce((a,b)->a+","+b).ifPresent((s)->System.out.println("::"+s));
        stringList.stream().sorted().reduce(binaryOperator).ifPresent((s)->System.out.println("::"+s));

        //stringList.stream().sorted().reduce((a,b)->a+","+b);
        //stringList.stream().forEach(System.out::println);
        //stringList.stream().forEach((s)->System.out.println(s));
        Consumer<String> consumer = (s)->{
            System.out.println("Hello :"+s);
        };

        stringList.stream().forEach(consumer);




       /* List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(10);
        intList.add(20);
        intList.stream().reduce((a,b)->a+b).ifPresent(System.out::println);*/


    }
}
