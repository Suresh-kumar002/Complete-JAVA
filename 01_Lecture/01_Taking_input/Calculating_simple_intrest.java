import java.util.Scanner;
public class Calculating_simple_intrest {
    public static void main(String[] args) {
        Scanner si =new Scanner(System.in);

        // String str="suresh kumar";
        // System.out.println(str);    //Sting using no char

        // System.out.print("Enter the string: ");
        // String g=si.next();    // only for index first print like-suresh kumar given stirng to prit only suresh
        // System.out.print(g);

        // System.out.print("Enter the string: ");y
        // String x=si.nextLine();    // print complete string
        // System.out.print(x);

        // char c=si.charAt(0);  //char print to intex in java 
        // System.out.print(c);

        // long l=si.nextLong();

        // double j=si.nextDouble();

        // float f=si.nextFloat();
        //                              Int taking 
        System.out.print("Entre the p: ");
        int p=si.nextInt();
        System.out.print("Enter the r: ");
        int r=si.nextInt();
        System.out.print("Enter the t: ");
        int t=si.nextInt();
        

        int D=(p*t*r)/100;
        System.out.println(D);

        
    }

}
