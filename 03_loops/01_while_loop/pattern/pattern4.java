package pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        
        

        // while (i<=n) {
        //     int j=1;
        //     int val=i;
            
        //     while (j<=i) {
        //         System.out.print(val);
        //         j=j+1;
        //         val=val+1; 
        //     }
        //     System.out.println( );
        //     i=i+1;    
        // }
        
        while (i<=n) {
            int j=1;
            
            
            while (j<=i) {
                System.out.print(i+j-1);
                j=j+1;
                
            }
            System.out.println( );
            i=i+1;    
        }
    }
}
