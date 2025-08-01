import java.util.Scanner;

public class _05_practice {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char name=s.nextLine().charAt(0);

        System.out.print("Enter the name: ");
        int m1,m2,m3;
        System.out.print("Enter the m1: ");
        m1=s.nextInt();
        System.out.print("Enter the m2: ");
        m2=s.nextInt();
        System.out.print("Enter the m3: ");
        m3=s.nextInt();
        int average=(m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(average);
    }

}
