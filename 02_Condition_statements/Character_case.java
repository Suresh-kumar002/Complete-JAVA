import java.util.Scanner;

public class Character_case {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.err.println(1);
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(0);
        }
        else{
            System.err.println(-1);
        }

    }

}
