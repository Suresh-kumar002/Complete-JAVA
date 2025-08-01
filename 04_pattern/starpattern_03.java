import java.util.Scanner;

public class starpattern_03 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        while (i<=n) {
            int j=n;
            while (j>=i) {
                System.out.print("*");
                j--;
                
            }
            System.out.println();
            i++;
            
        }
    }

}
