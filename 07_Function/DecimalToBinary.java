import java.util.Scanner;

public class DecimalToBinary {

    public static void DecToBin(int decNUM){
        int myNUM=decNUM;
        int pow=0;
        int binNUM=0;
        while (decNUM>0) {
            int LD=decNUM%2;
            binNUM=binNUM+(LD*(int)Math.pow(10, pow));
            pow++;
            decNUM =decNUM/2;

            
        }
        System.out.println("binary num of : " +myNUM + " = " +binNUM ) ;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decNUN=s.nextInt();
        DecToBin(decNUN);
    }

}
