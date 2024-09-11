package DataStructure.Sorting;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {11,22,33,44,55,66};
        int target = 37;
        System.out.println(findTarget(array, target));
        System.out.println(ceilingOfTheNum(array, target));
        System.out.println(floorOfTheNum(array, target));

    }

    public static int findTarget(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = (start + end)/2;

            if (array[mid] == target) {
                return array[mid];
            } else if (target > array[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int ceilingOfTheNum(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return array[mid];
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return array[start];
    }
    public static int floorOfTheNum(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return array[mid];
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return array[end];
    }
}
