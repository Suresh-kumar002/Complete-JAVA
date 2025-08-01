import java.util.Scanner;

public class Relation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        

        boolean isEq=(a==b);
        boolean neq=(a!=b);
        boolean isgr=(a>b);
        boolean isless=(a<b);
        boolean isEqgr=(a>=b);
        boolean isEqless=(a<=b);
        System.out.println("Is Equal ,"+ isEq);
        System.out.println("Is Not Equal ,"+ neq);
        System.out.println("Is Greater ,"+ isgr);
        System.out.println("Is Less ,"+ isless);
        System.out.println("Is Greater Equal ,"+ isEqgr);
        System.out.println("Is Less Equal ,"+ isEqless);


    }

}
