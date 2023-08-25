package arrays;

public class SmallestAndLargestNumberInArray {
    public static void main(String[] args) {
        int[] a = {52,4,6,2,3,88,4,56,23,86,3,0};

        smallestAndLargestNumberInArray(a);
    }

    private static void smallestAndLargestNumberInArray(int[] a) {

        int smallest = a[0];
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if(smallest>a[i])
            {
                smallest = a[i];
            }
            if(largest<a[i]){
                largest=a[i];
            }
        }

        System.out.println("Smallest Number is "+smallest+":: And largest number is "+largest);
    }
}
