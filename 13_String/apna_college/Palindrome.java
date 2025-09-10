package apna_college;
public class Palindrome {
    public static boolean isPalindome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                
                //not a palindrome
                return false;
            }
        }
        System.out.print("The String is palindrome : ");
        return true;
    }
    public static void main(String[] args) {
        String str ="racecar";
        System.out.println(isPalindome(str));
        
    }

}
