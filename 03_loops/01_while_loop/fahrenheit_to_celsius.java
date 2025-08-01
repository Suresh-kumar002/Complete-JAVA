import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();
        int f=start;
        while (f<=end) {
            int c=(int)((5.0/9)*(f-32));
            System.out.println(f + "\t" + c);
            f =f+step;
            
        }

    }

}
