import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a=s.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b=s.nextInt();
        System.out.print("Enter the 3nd number: ");
        int c=s.nextInt();
        boolean isALargest=(a>=b)&&(a>=c);
        System.out.println(isALargest);
        System.out.println((a>=b)||(a>=c));
        System.out.println(!(a>=b));


    }

}
