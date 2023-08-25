package arrays;
//arr1 = {1,5,5,7,9}
//arr2 = {1,3,5,8}
//output = {1,1,3,5,5,5,7,8,9}

import java.util.Arrays;

public class MergeTwoSortedArraysIntoOneSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,5,5,7,9};
        int[] arr2 = {1,3,5,8};
        int[] output = new int[arr1.length+arr2.length];
        mergeArrays(arr1,arr2,output);
    }

    private static void mergeArrays(int[] arr1, int[] arr2, int[] output) {
        int i=0,j=0,k=0;

        for ( ;i < arr1.length && j< arr2.length; k++) {
            if(arr1[i]>arr2[j]){
                output[k]=arr2[j];
               // System.out.println(arr2[j]);
                j++;
            }
            else{
                output[k]=arr1[i];
                //System.out.println(arr1[i]);
                i++;
            }

        }
        for (; i < arr1.length; i++, k++) {
            output[k] = arr1[i];
        }
        for (; j < arr2.length; j++, k++) {
            output[k] = arr2[j];
        }



            Arrays.stream(output).forEach(System.out::println);
    }
}
