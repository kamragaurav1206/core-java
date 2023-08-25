package arrays;

import java.util.Arrays;

//arr1 = {1,4,6,7,4,6}
//arr2 = {3,2,5,4}
//output = {1,4,6,7,4,6,3,2,5,4}
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,7,4,6};
        int[] arr2 = {3,2,5,4};
        int[] output = new int[arr2.length+arr1.length];
        
        mergeArray(arr1,arr2,output);
    }

    private static void mergeArray(int[] arr1, int[] arr2, int[] output) {
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        int start = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            output[start+i]= arr2[i];
        }

        Arrays.stream(output).forEach(System.out::println);
    }
}
