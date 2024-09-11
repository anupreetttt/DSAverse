package DataStructure.Grokking.Pattern2_FastAndSlowPointer;
 
public class HappyNumbers {

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;
       do {
           slow = computeNum(slow);
           fast = computeNum(computeNum(fast));

           if (slow == 1) return true;
       } while (slow != fast);

       return false;
    }

    public static int computeNum(int n) {

        int sum = 0;

        while (n !=0 ) {
            sum += (n%10) * (n%10);
            n = n/10;
        }

        return sum;
    }
    public static void main(String[] args) {

        int n = 2;

        System.out.println(isHappy(n));
    }
}
