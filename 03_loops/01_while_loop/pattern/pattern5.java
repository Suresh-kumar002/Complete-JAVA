package pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        
        // while (i<=n) {
        //     int space=1;
        //     while (space<=n-i) {
        //         System.out.print(" ");
        //         space +=1;

        //     }
        //     int j=1;
        //     while (j<=i) {
        //         System.out.print(i+j-1);
        //     
        //         j +=1;
                
        //     }
        //     System.err.println();
        //     i +=1;
        // }

         while (i<=n) {
            int space=1;
            while (space<=n-i) {
                System.out.print(" ");
                space +=1;

            }
            int j=1;
            int val =i;
            while (j<=i) {
                System.out.print(val);
                val +=1;
                j +=1;
                
            }
            System.err.println();
            i +=1;
        }
    }



}    

