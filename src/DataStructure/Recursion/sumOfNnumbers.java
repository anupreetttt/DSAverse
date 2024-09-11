package DataStructure.Recursion;

import java.util.Collections;

public class sumOfNnumbers {

    // find the sum of first n numbers

    public static void main(String[] args) {

//        System.out.println(sumRecursive(n));

        int[] arr = {2,3,4,5,6,7};
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        reverseArray(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int[] arr, int i) {


        int n = arr.length;
    if(i >= n/2) {
        return;
    }


    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;


    reverseArray(arr, i + 1);

    }

    static int sum(int n) {

        int mySum = 0;
        int m = n;
        for (int i = 1; i <= n; i++) {

            mySum += i;

        }
        return mySum;
    }

    static int sumRecursive(int n) {

        if(n == 0) {
            return 1;
        }

        return n + sumRecursive(n - 1);

    }
}
