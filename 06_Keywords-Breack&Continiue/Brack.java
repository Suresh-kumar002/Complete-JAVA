import java.util.Scanner;

public class Brack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n=s.nextInt();
        
        boolean divided=false;
        for(int d=2; d<n; d++){
            if(n%d==0){
                divided=true;
                break;
            }
            
        }
        // boolean divided=false;
        // int d=2;  
        // while (d<n) {
        //     if(n%d==0){
        //         divided=true;
        //         break;
        //     }
        //     d=d+1;
            
        //}
        if (divided) {
            System.out.println("number is not prime ");
        }
        else{
            System.out.println("number is prime");
        }
    }

}
