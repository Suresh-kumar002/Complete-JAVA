import java.util.Scanner;

public class pattern_07 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int j=1;
            int startingNum=i;
            while (j<=i) {
                System.out.print(startingNum);
                j++;
                startingNum++;
                
            }
            System.out.println();
            i++;
            
        }
    }

}
