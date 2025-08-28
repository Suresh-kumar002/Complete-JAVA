package Assigment;

import java.util.Scanner;

public class Que_04 {

    public static int SmDtInt(int sum){
        int sumDigits=0;
        while (sum>0) {
            int LastDIgit=sum%10;
            sumDigits +=LastDIgit;
            sum=sum/10;
            
        }
        return sumDigits;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=s.nextInt();

        System.out.println(SmDtInt(sum));
    }
}
