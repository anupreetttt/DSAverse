package DataStructure.Recursion;

public class LinearSerach_Recursion {


    public static int linearSearch(int[] arr, int target, int i) {


        if (i == arr.length ) {
            System.out.println("Target not found");
            return -1;
        }
        if(arr[i] == target){
            System.out.println("Target found");
            return i;
        }

        return linearSearch(arr, target, i + 1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,56};
        int target = 56;

        System.out.println(linearSearch(arr, target, 0));
    }
}
