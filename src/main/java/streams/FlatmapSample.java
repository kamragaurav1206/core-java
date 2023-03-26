package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatmapSample {
    public static void main(String[] args) {
        /*Stream.of("dog", "cat")             // stream of 2 Strings
                .flatMapToInt(s -> s.chars())  //chars
                        .distinct()*/

        IntStream intStream = Stream.of("dog","cat")
                .flatMapToInt(s->s.chars());

        //101,123,123

        Stream<Stream<Character>> cc = Stream.of("dog","cat").map(s->s.codePoints().mapToObj(c->(char)c)); //IntFunction has method R apply(int a) it always accept int as parameter
        /**
         *
         * This method takes no method arguments and returns an IntStream of Unicode code points from this sequence
         *
         * codePoints() method does not throw any exception at runtime. But, if you call this method on null string reference then NullPointerException is thrown.
         *
         */

        System.out.println("DDDDDDDD");
        cc.forEach(System.out::println);
        System.out.println("XXXXX");
        intStream.forEach(System.out::println);
        System.out.println("YYY");


        IntStream intStream1 = Stream.of("dog","cat")
                .flatMapToInt(s->s.chars());
        Stream<Integer> integerStream = intStream1.boxed();
        List<Integer> integers = integerStream.collect(Collectors.toList());
        System.out.println("-------------");
        integers.forEach(System.out::println);



    }
}
