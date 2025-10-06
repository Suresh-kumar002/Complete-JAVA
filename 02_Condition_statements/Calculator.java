import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the a : ");
        float a=s.nextInt();
        System.out.print("Enter the b : ");
        float b=s.nextInt();
        System.out.print("Enter the operatore : ");
        char operatore=s.next().charAt(0);

        switch (operatore) {
            case '+': System.out.println(a+b);               
                break;
            case '-': System.out.println(a-b);               
                break;    
            case '*': System.out.println(a*b);               
                break;
            case '/': System.out.println(a/b);               
                break;
            case '%': System.out.println(a%b);               
                break;            
        
            default: System.out.println("wrong operatore");
                break;
        }
    }

}
