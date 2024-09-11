package DataStructure.Arrays;

public class CheckIfArrayIsSorted {

    private boolean isSorted(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean getMethod(int[] arr) {
        return isSorted(arr);
    }

    public boolean recursiveSorting(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i+1] && recursiveSorting(arr, i + 1);
    }
}
