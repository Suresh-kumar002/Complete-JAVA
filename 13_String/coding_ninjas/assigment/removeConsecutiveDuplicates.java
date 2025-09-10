package coding_ninjas.assigment;

import java.util.Scanner;

public class removeConsecutiveDuplicates {
    public static String RemoveconsecutiveDuplicates(String str){
        int n=str.length();

        if (n==0) {
            return str;
        }
        String ans="";
        int startIndedx=0;
        while (startIndedx<n) {
            char uniqueChar=str.charAt(startIndedx);
            int nextUniqueCharIndex=startIndedx+1;

            while (nextUniqueCharIndex<n && str.charAt(nextUniqueCharIndex)==uniqueChar) {
                nextUniqueCharIndex +=1;
            }
            ans+=uniqueChar;
            startIndedx=nextUniqueCharIndex;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        System.out.println(RemoveconsecutiveDuplicates(str));
    }

}
