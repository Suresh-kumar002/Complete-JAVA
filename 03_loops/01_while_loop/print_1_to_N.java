import java.util.Scanner;

public class print_1_to_N {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1;

        while (a<=n) {
            System.out.println(a);
            a=a+1;
            
        }

    }

}
