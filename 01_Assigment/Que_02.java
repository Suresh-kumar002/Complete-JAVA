import java.util.Scanner;

public class Que_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n=s.nextInt();
        int evensum=0;
        int oddsum=0;

        while (n>0) {
            int last=n%10;
            if (last%2==0) {
                evensum +=last;
            }
            else{
                oddsum =+last;
                
            }
            n=n/10;
            
        }
        System.out.println(evensum + " " + oddsum);
    }

}
