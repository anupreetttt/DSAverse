package Problems;

public class binary_search {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55,66,77,88,99};
        int target = 56;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int top = arr.length - 1;


        while (low <= top) {
            int mid = (top + low)/2;

            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target){
                low = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        return arr[top];
    }
}
