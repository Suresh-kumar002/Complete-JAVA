import java.util.Scanner;

public class prime_notprime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int d=2;
        while (d<=n-1) {
            if(n%d==0){
                System.out.println("not prime");
                return;
                
            }
            d=d+1;
 
        }
        System.out.println("prime");
            
    }

}
