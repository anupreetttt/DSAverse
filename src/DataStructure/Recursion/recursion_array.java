package DataStructure.Recursion;

import java.util.ArrayList;

public class recursion_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6};
//        System.out.println(sorted(arr, 0));
//        System.out.println(linearSearchWRecursion(arr, 0 , 6));
        System.out.println(findAllTargetsByInFunctionList(arr, 0, 4));
//        System.out.println(sortedOrNot(arr));
    }


    static boolean sortedOrNot(int[] arr) {

        for(int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    static boolean sorted(int[] arr, int i){
        if (i == arr.length - 1){
            return true;
        }

        return arr[i] <= arr[i+1] && sorted(arr, i+1);
    }

    static int linearSearchWRecursion(int[] arr, int index, int target){
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return arr[index];
        }

        return linearSearchWRecursion(arr, index + 1, target);
    }

    static ArrayList<Integer> findAllTargets(int[] arr, int index, int target, ArrayList<Integer> list){
        if (index == arr.length) {
            return list; //when this is returned "return findAllTargets(arr, index + 1, target, list);" value will be equal to "list"
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return findAllTargets(arr, index + 1, target, list);
    }

    static ArrayList<Integer> findAllTargetsByInFunctionList(int[] arr, int index, int target){

        ArrayList<Integer> myList = new ArrayList<>();
        if (index == arr.length) {
            return myList; //when this is returned "return findAllTargets(arr, index + 1, target, list);" value will be equal to "list"
        }

        if (arr[index] == target) {
            myList.add(index);
        }
        ArrayList<Integer> val = findAllTargetsByInFunctionList(arr, index + 1, target);
        myList.addAll(val);

        return myList; // returning the list not the function that's why going back to the previous function calls in stack
    }
}
