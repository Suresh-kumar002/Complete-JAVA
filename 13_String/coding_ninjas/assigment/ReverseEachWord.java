package coding_ninjas.assigment;

import java.util.Scanner;

public class ReverseEachWord {

    // Reverses a word between start and end indices
    public static String reverseWord(String str, int start, int end) {
        String reverse = "";
        while (start < end) {
            reverse = str.charAt(start) + reverse;
            ++start;
        }
        return reverse;
    }

    // Reverses each word in a sentence
    public static String reverseEachWord(String str) {
        int n = str.length();
        int previousSpaceIndex = -1;
        String ans = "";
        int i = 0;

        for (; i < n; i++) {
            if (str.charAt(i) == ' ') {
                ans += reverseWord(str, previousSpaceIndex + 1, i) + " ";
                previousSpaceIndex = i;
            }
        }

        // For the last word (no space after it)
        ans += reverseWord(str, previousSpaceIndex + 1, i);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reversed = reverseEachWord(str);
        System.out.println(reversed);

        
    }
}
