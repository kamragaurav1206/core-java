package streams;

import java.util.Arrays;
import java.util.List;

public class ProblemStatement1 {

    //we have 2 list
    //list 1 having A,B,C,D
    //list 2 having B,C,E
    // we need third list which having element of list 1 which are not present in list 2
    //ans should be A,D as we are taking only list 1 element

    public static void main(String[] args) {
        List list1 =  Arrays.asList('A','B','C','D');
        List list2 =  Arrays.asList('B','C','E');

        list1.stream().filter(a->!list2.contains(a)).forEach(System.out::println);

    }
}

