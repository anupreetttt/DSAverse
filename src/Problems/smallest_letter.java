package Problems;

public class smallest_letter {

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int top = letters.length - 1;

        while(top >= low) {
            int mid = low + (top - low)/2;

            if(target >= letters[mid]) {
                low = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        return letters[low % letters.length];
    }
}
