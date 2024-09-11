package DataStructure.Recursion;

public class recursion {

    public static void main(String[] args) {
//        System.out.println(fibonacci(50));
//        printNum(5) ;
        System.out.println(factorial(5));
//        firstFive(1);
     }

    public static int fibonacci(int n){

        if(n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
    static int factorial(int n){
        if (n <= 1) {
            return 1;
        }

        return (n * factorial  (n - 1));
    }

    static void printNum(int n ) {

        if(n == 0) return;

        printNum(n-1);
        System.out.println(n);
    }

    static void firstFive(int n) {
        if (n == 6) return;

        System.out.println(n);
        firstFive(n + 1);
    }
}
