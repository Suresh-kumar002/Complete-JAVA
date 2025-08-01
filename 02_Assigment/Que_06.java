//Que_06:-Square root 

import java.util.Scanner;

public class Que_06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the square value :");
        int n= s.nextInt();
        int op=0;
        while (op*op<=n) {
            op++;
            
        }
        op=op-1;
        System.out.println(op);



    }

}

