package arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int a[] = {5,2,7,45,8,3,0,6};
        //sortArrayUsingTwoLoops(a);
        //sortArrayInDescendingOrderUsingTwoLoops(a);
        sortArrayUsingSingleLoop(a);


    }


    //23,4,2,55,3,2,6,7
    private static void sortArrayUsingSingleLoop(int[] a) {
        for (int i = 0; i < a.length-1; i++) {

            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                i=-1;
            }


        }

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void sortArrayInDescendingOrderUsingTwoLoops(int[] a) {
        for(int i=0;i<a.length;i++){
            int temp=0;
            for (int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }

        Arrays.stream(a).forEach(System.out::println);
    }

    public static void sortArrayUsingTwoLoops(int[] a){
        for(int i=0;i<a.length;i++){
            int temp=0;
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }

        Arrays.stream(a).forEach(System.out::println);
    }
}
