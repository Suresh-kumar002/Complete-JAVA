package coding_ninjas;
import java.util.Scanner;

public class Cound_Words {
    public static int countwords(String input){
        int wordCount=0;
        for(int i=0; i<input.length(); i++){
            if (input.charAt(i)==' ') {
                wordCount++;
                
            }
        }
        wordCount++;
        return wordCount;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        System.out.println("Word count : "+countwords(input));
    }

}
