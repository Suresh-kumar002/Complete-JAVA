import java.util.Scanner;
public class Arthmatic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the f: ");
        int f=s.nextInt();
        // int cel =(5/9)*(f-32);
        // int cel=(5*(f-32))/9;
        int cel=(int)((5.0/9)*(f-32));
        System.out.println(cel);


        System.out.println(9/5);
        System.out.println(9+5);
        System.out.println(9-5);
        System.out.println(9*5);
        System.out.println(9%5);


        System.out.println('a'+3);
        System.out.println('a'/3);
        char c='a';
        char i=(char)(c+3);
        System.out.println(i);

        System.out.println('a'+'b');

        

    }

}
