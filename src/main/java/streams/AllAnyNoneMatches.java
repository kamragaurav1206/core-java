package streams;

import java.util.Arrays;
import java.util.List;

public class AllAnyNoneMatches {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8);
        //All three(allMatch,anyMatch,noneMatch takes predicate as arguments)
        System.out.println(list.stream().allMatch(a -> a % 2 == 0));//true
        //in case of anyMatch if any of the variable or condition got satisfied it will never check for other member of list
        //so here in this example none of the element is divided by 5 that means anyMatch will check for all 4 items
        //we can clearly see this via expanding the lamda expression here see the example where we are deviding element by 5 in case of anyMatch and see how many time sout will print
        System.out.println(list.stream().anyMatch(a -> a % 5 == 0));//false

        System.out.println(list.stream().anyMatch((a) -> {
            System.out.println("print here");
            if (a % 5 == 0) {
                return true;
            }
            return false;
        })); // here "print here" should print 4 times as length of list is 4 and non of them is devided by 5
        System.out.println(list.stream().noneMatch(a -> a % 5 == 0));//true
    }
}
