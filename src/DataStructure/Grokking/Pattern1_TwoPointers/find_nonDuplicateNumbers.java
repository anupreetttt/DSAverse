package DataStructure.Grokking.Pattern1_TwoPointers;

public class find_nonDuplicateNumbers {

    public static int findDuplicate(int[] arr) {

        int index = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[index++] = arr[i+1];
            }
        }

        for (int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        return index;
    }
    public static void main(String[] args) {


        int[] arr = {2, 3, 3, 3, 6, 9, 9};

        // o/p arr = {2, 3, 6, 9} , length = 4;
        System.out.println(findDuplicate(arr));
    }
}
