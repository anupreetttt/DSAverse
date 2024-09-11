package Problems;

public class Main {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 11, 66, 77, 88, 99};
        int target = 66;
        int found = linearSearch(arr, target);
        System.out.println(found);

        System.out.println(linearSearchInRange(arr, target));

        String str = "Anupreet";
        char find = 'z';
        System.out.println(strLinearSearch(str, find));

        System.out.println(minLs(arr));
    }

    public static boolean strLinearSearch(String str, char find) {
        if (str.length() == 0) {
            return false;
        }
        {
            for (int i = 0; i < str.length(); i++) {
                if (find == str.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchInRange(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 1; i <= 4; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int minLs(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}