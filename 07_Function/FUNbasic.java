import java.util.Scanner;

public class FUNbasic {
    public static void printHELO(){
        System.out.println("Hello World !");
        System.out.println("Hello World !");
        System.out.println("Hello World !");
        System.out.println("Hello World !");
    }
    public static int calculatesum(int num1,int num2){ //parameters or formal parameters
        int sum=num1+num2;
        return sum;

    }

    
       
    
    public static void main(String [] args){
        printHELO();
        
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=calculatesum(a, b);
        System.out.println("Sum : " + sum);

       

    


       


      

       

    }

}
