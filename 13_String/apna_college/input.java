package apna_college;
import java.util.Scanner;

public class input {
    public static void PrintLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d','e','f'};
        // String str="ABCD";
        // String str2= new String("ABCD");
        // System.out.println(str2);
        // System.out.println(arr);
        // System.out.println(str);

        Scanner s=new Scanner(System.in);
        String name;
        name=s.nextLine();
        System.out.println(name);
        System.out.println("Length of string : "+name.length());

        //Concatenation
        String firstname="Suresh";
        String Lastname="Tanwar";

        String Fullname=firstname+" "+Lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.charAt(0));

        PrintLetters(Fullname);
    }

}
