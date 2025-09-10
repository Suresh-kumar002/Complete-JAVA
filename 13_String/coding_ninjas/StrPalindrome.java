package coding_ninjas;

import java.util.Scanner;
public class StrPalindrome {
    public static boolean checkPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j) {
            if (str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            else{
                i++;
                j--;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        // String str="abba";
        System.out.println(checkPalindrome(str));
        
    }

}
