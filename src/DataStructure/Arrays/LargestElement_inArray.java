package DataStructure.Arrays;

public class LargestElement_inArray {

    public static void main(String[] args) {


        int[] arr = {100,2,3,45,105};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
