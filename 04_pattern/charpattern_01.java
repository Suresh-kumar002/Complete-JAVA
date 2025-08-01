import java.util.Scanner;

public class charpattern_01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=n) {
                System.out.print((char)('A'+j-1));
                // System.out.print((char)(j));  Emoji print ke liye
                j++;
                
            }
            System.out.println();
            i++;
            
        }

    }

}
