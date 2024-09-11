package DataStructure.Grokking.Stacks;

public class NextGreaterElement {

    public static void main(String[] args) {


        int[] arr = {4, 5, 2, 25,4,41};


      for (int i = 0; i < arr.length; i++){

          if(i == arr.length - 1) {
              arr[i] = -1;
              break;
          }
          for(int j = i + 1; j < arr.length; j++){
              if(arr[i] < arr[j]) {
                  arr[i] = arr[j];
                  break;
              }
          }
      }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
