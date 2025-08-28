package Assigment;

import java.util.Scanner;

public class Que_03 {
    public static boolean isPalindrome(int number){
        int originalNUM=number;
        int reversedNUM=0;
        int remainder;

        while (number>0) {
            remainder=number %10;
            reversedNUM=remainder+(reversedNUM*10);
            number=number/10;  
        }
        if (reversedNUM==originalNUM) {
            return true;           
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int number=s.nextInt();
       
        System.out.println(isPalindrome(number));
    }

}
