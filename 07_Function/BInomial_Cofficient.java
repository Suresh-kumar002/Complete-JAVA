
// NcR
import java.util.Scanner;

public class BInomial_Cofficient {

    public static int factorial (int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans=ans*i;
        }
        return ans;
    }

    
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=s.nextInt();
        System.out.print("Enter the value of r:");
        int r=s.nextInt();
        

        int num=factorial(n);
        
                                                                                                                                  
        int den1=factorial(r);
       
        int den2=factorial(n-r);
        
        int ans=num/(den1*den2);
        System.out.println(ans);

    }

}
