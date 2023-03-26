package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatmapSample1 {

    public static void main(String[] args) {
        Stream<String> words = Stream.of(
                "lorem", "ipsum", "dolor", "sit", "amet"
        );

        Function<String, IntStream> intF = CharSequence::chars; //chars is method of CharSequence interface.. implemetation class of this interface is String,StringBuilder,StringBuffer


        intF.apply("Gaurav").forEach(System.out::println);

        System.out.println("sssss");

        Function<IntStream, Stream<Character>> charF = s -> s.mapToObj(val -> (char) val);

        charF.apply(intF.apply("Gaurav")).forEach(System.out::println);

        System.out.println("aaaaaa");

        words
                // Chaining functions
                .map(intF.andThen(charF))
                // Observe the mapped values
                .forEach(s -> System.out.println(s.collect(Collectors.toList())));

        List listOfLetters = words
                .map(intF)
                .flatMap(charF)
                .collect(Collectors.toList());

    }
}
