package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Convert ArrayList in Streams
	In one line display all records that start with 'a' in stringList
	In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
	In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
	In one line find whether any record start with 'a' in stringList
	In one line find whether all records start with 'a' in stringList
	In one line find whether none of the records start with 'b' in stringList
	In one line count records start with 'a' in stringList

 */
public class ArrayList_Stream {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xyz");
        list.add("abc");
        list.add("adc");
        list.add("bcc");
        list.add("xyz");
        list.add("qwe");
        //In one line display all records that start with 'a' in stringList
       // list.stream().filter(s->s.startsWith("a")).forEach(System.out::println);

        //In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
        //list.stream().filter(s->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
        //In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
        //list.stream().filter(s->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).map(s->s.toUpperCase()).forEach(System.out::println);
        //In one line find whether any record start with 'a' in stringList
        //list.stream().filter(s->s.startsWith("a")).findAny().ifPresent(System.out::println);
        //In one line find whether all records start with 'a' in stringList
          list.stream().filter(s->!s.startsWith("a")).findAny().ifPresent((s)->System.out.println("Not all the element start with a"));
        list.parallelStream().filter(s->!s.startsWith("a")).findAny().ifPresent((s)->System.out.println("Not all the element start with a"));
        //In one line find whether none of the records start with 'b' in stringList
       // list.stream().filter(s->s.startsWith("b")).findAny().ifPresentOrElse(System.out::println , ()->System.out.println("Nothing is find"));
        //In one line count records start with 'a' in stringList
       // System.out.println(list.stream().filter(s->s.startsWith("a")).count());

    }

}
