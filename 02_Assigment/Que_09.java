import java.util.Scanner;

public class Que_09 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n=s.nextInt();
        // int i=1;
        long factorial=1;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
          
        } 
        else {
            
            // while (i <= n) {
            //     factorial *= i; 
            //     i++;

            // }
            // System.out.println("Factorial of " + n + " is: " + factorial);
        
            for(int j=1; j<=n; j++){
                factorial *=j;
     
            }
            System.out.println("Factorial of " + n + " is: " + factorial);    
            
                
        }
        
       
    }
    

}
