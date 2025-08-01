import java.util.Scanner;

public class charpattern_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int j=1;
            char startingChar=(char)('A'+i-1);
            while (j<=n) {
                System.out.print(startingChar);
                j++;

            }
            System.out.println();
            i++;
            
        }

    }

}
