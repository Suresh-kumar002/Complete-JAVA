import java.util.Scanner;

public class charpattern_06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int  j=1;
            char value=(char)('A'+n-i);
            while (j<=i) {
                System.out.print(value);
                value++;
                j++;

            }
            System.out.println();
            i++;
        }
    }

}
