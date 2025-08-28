package Assigment;

import java.util.Scanner;

public class Que_01 {
    public static double average(double a,double b,double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the 1st num : ");
        double a=s.nextInt();
        System.out.print("Enter the 2nd num : ");
        double b=s.nextInt();
        System.out.print("Enter the 3rd num : ");
        double c=s.nextInt();

        System.out.println("Average : " + average(a, b, c));

        

        
    }

}
