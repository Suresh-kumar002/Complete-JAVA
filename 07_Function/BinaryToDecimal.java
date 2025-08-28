import java.util.Scanner;

public class BinaryToDecimal {

    public static void binTodec(int binNUM){
        int myNUM=binNUM;
        int pow=0;
        int decNUM=0;
        while (binNUM>0) {
            int LD=binNUM%10;
            decNUM=decNUM+(LD*(int)Math.pow(2, pow));
            pow++;
            binNUM=binNUM/10;
            
        }

        System.out.println("decimal of " +myNUM + " = " +decNUM ) ;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int binNUM=s.nextInt();
        binTodec(binNUM);

    }    

}
