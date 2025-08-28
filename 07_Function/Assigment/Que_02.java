package Assigment;

import java.util.Scanner;

public class Que_02 {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
            
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");
        n=s.nextInt();

        if (isEven(n)) {
            System.out.println("n is Even");
            
        }else{
            System.out.println("n is odd");
        }

    }

}
