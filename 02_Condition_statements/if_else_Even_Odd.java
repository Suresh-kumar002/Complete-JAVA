import java.util.Scanner;
public class if_else_Even_Odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        // if(a%2==0){
        //     System.err.println("even");

        // }
        // else{
        //     System.out.println("odd");
        // }

        if(a%2==0){
            System.err.println("even");
            return;

        }
        System.err.println("odd");
    }

}
