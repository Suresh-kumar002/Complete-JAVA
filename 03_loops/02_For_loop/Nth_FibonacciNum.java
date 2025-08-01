/*0 1 1 2 3 5 8 13
0 1 2 3 4 5 6.....

fib(0) = 0
fib(1) = 1
fib(2) = fib(0) + fib(1)
fib(3) = fib(1) + fib(2)
fib(4) = fib(2) + fib(3)
fib(n) = fib(n-2) + fib(n-1)*/

import java.util.Scanner;
public class Nth_FibonacciNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numer :");
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0; i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }

}
