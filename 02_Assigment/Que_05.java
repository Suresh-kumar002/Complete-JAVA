
//Que_05:- convert dicimal to binary
import java.util.Scanner;

public class Que_05 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the binary number :");
        int n=s.nextInt();
        int binary=0,pv=1;
        while (n>0) {
            int rem=n%2;
            binary +=rem*pv;
            pv *=10;
            n=n/2;
                     
        }
        System.out.println(binary);
    }

}
