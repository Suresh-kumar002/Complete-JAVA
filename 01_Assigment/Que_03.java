import java.util.Scanner;

public class Que_03 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x=s.nextInt();
        System.out.print("Enter the value of n : ");
        int n=s.nextInt();
        int ans=1;
        while (n>0) {
            ans=ans*x;
            n=n-1;
        }
        System.out.println(ans); 
    }
}
