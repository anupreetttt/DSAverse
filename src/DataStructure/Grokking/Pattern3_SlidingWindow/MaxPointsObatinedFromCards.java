package DataStructure.Grokking.Pattern3_SlidingWindow;

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
public class MaxPointsObatinedFromCards {
    public static int maxScore(int[] cardPoints, int k) {

        if (cardPoints.length == 0 || k > cardPoints.length || k <=0) {
            return 0;
        }
        int sum = 0;
        int max = 0;

        int start = 0;
        int end = cardPoints.length - 1;

        /* Not needed:- */
        // if (cardPoints.length == k) {
        //     for (start = 0; start < cardPoints.length; start++) {
        //         sum += cardPoints[start];
        //     }
        //     return sum;
        // }
        for (start = 0; start < k; start++) {
            sum += cardPoints[start];
        }

        start--;
        max = sum;

        while(start >= 0) {
            sum += cardPoints[end--];
            sum -= cardPoints[start--];

            max = Math.max(max, sum);

        }

        return max;
    }

    public static void main(String[] args) {

        int[] cardPoints = {1,79,80,1,1,1,200,1};
        int k = 3;

        System.out.println("Max points final: " + maxScore(cardPoints, k));
    }
}
