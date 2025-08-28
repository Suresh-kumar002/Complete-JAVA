import java.util.Scanner;

public class Primeornot {

    public static boolean isprime(int n){
        //corner cases
        if (n==2) {
            return true;          
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) {              
                return false;
                
            }
        }
        return true;

    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println(isprime(n));
        
    }

}
