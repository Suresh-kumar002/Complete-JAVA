package coding_ninjas.assigment;
import java.util.Scanner;

public class removeAlloccu {

    // Removes all occurrences of a given character from the string
    public static String removeAlloccurrenceOfChar(String str, char ch) {
        int n = str.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ch) {
                ans += str.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = s.nextLine();

        System.out.println("Enter the character to remove:");
        char ch = s.next().charAt(0);  // ✅ This correctly reads a single character

        String result = removeAlloccurrenceOfChar(str, ch);
        System.out.println("Result: " + result);

       
    }
}
