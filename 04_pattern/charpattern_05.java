import java.util.Scanner;

public class charpattern_05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int  j=1;
            char value=(char)('A'+i-1);
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
