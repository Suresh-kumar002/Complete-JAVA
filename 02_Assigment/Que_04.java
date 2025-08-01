
//Que_04:- convert   binary to decimal

import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the binary number :");
        int number=s.nextInt();
        int decimal=0,pow=1;
        while (number>0) {
            int lastDigit=number%10;
            decimal +=lastDigit*pow;
            pow *=2;
            number=number/10;
                     
        }
        System.out.println(decimal);
    }

}
