package DataStructure.String;

public class RemoveElement_27 {

    public static void removeElement(int[] arr, int val) {

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                count++;

                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
//                i--;
                 break;
            }
        }

        for (int i = 0; i < arr.length - count - 1; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement(nums, 2);
    }
}
