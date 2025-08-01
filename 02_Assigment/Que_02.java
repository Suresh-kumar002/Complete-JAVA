import java.util.Scanner;

public class Que_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int count =1;
        int d=1;
        while (count<=n) {
            int num=3*d+2;
            if (num%4!=0) {
                System.out.print(num + " ");
                count++;
                
            }
            d++;
       
            
        }
       
    }

}
