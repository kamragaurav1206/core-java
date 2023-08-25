package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//In this question, you will be given an array arr and a target.
// You have to return the indices of the two numbers such that they add up to the target.
//for ex: {1,3,6,8,4} target is 10 so ans is {2,4} as 6+4 =10 and index of 6 is 2 and index of 4 is 4
public class TwoSumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,2};
        int target =11;

        twoSumOfAnArray(arr,target);
    }

    private static void twoSumOfAnArray(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        Set set = map.keySet();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(target-arr[i])){
                System.out.println(map.get(target-arr[i])+","+map.get(arr[i]));
                break;
            }
        }

    }

}
