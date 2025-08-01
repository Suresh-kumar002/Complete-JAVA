//Que_03;- print revearse number
import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a=n,revNum=0;
        while (a>0) {
            int lastDigit=a%10;
            a=a/10;
            revNum= revNum*10+lastDigit;

            
        }
        System.out.println(revNum);
    }

}
