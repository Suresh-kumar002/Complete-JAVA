import java.util.Scanner;

public class Que_01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the basic :");
        int basic=s.nextInt();

        System.out.print("Enter the grade :");
        char grade = s.next().charAt(0);

       double hra=(0.2*basic);
        double da=(0.5*basic);
    
        int allowance;
        if (grade=='A') {
            allowance=1700;
        }
        else if(grade=='B'){
            allowance=1500;
        }
        else{
            allowance=1300;
        }

        double pf=(0.11*basic);

        int total_salary=(int)(basic+hra+da+allowance-pf);
        int ans=Math.round(total_salary);

        System.out.println(ans);
    }

}
