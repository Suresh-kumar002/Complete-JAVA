package function_call;

import java.util.Scanner;

public class primeToN {
    public static boolean isprime(int n){
        int d=2;
        while (d<n) {
            if (n%d==0) {
                return false;
                
            }
            d++;
            
        }
        return true;
    }
    public static void printPrime(int n){
        for(int i=2; i<=n; i++){
        //need to cheack if i is prime or not
            boolean isIprime=isprime(i);
            if (isIprime) {
               System.out.println(i);
            }
        }

            
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=s.nextInt();
        printPrime(n); 
        System.out.println("Back in main");
    }

}
