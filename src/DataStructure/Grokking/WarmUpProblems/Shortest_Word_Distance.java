package DataStructure.Grokking.WarmUpProblems;

public class Shortest_Word_Distance {


//    public static int findDistance(String[] words, String word1, String word2) {
//
//        int j = 0;
//        int a = 0;
//        int i = 0;
//        while(i < words.length){
//            if (word1.equals(words[i])) {
//                 j = i;
//                 break;
//            }
//            i++;
//        }
//        while (j < words.length) {
//            if (word2.equals(words[j])) {
////                a = j;
//                break;
//            }
//            j++;
//        }
//
//        return j - i;
//    }
public static int shortestDistance(String[] words, String word1, String word2) {
    int index1 = -1; // Index of word1
    int index2 = -1; // Index of word2
    int minDistance = Integer.MAX_VALUE;

    for (int i = 0; i < words.length; i++) {
        if (words[i].equals(word1)) {
            index1 = i;
        } else if (words[i].equals(word2)) {
            index2 = i;
        }

        if (index1 != -1 && index2 != -1) {
            minDistance = Math.min(Math.abs(index1 - index2), minDistance);
        }
    }

    return minDistance;
}


    public static void main(String[] args) {

        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

        String word1 = "fox";
        String word2 = "dog";
        System.out.println(shortestDistance(words, word1, word2));
    }
}
