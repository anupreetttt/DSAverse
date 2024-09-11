package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class multidimensional_arrays {

    public static void main(String[] args) {
//        int[][] arr= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9,5,67,7}
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

//        int[][] arr2 = new int[3][3];
//
//        Scanner n = new Scanner(System.in);
//
//        for(int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = n.nextInt();
//            }
//        }
//        for(int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j]);
//            }
//            System.out.println();
//        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        System.out.println(list);
    }
}
