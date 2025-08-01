//Que_07:- Squance number print

import java.util.Scanner;

public class Que_07 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=s.nextInt();
        System.out.print("Enter the squance number : ");
        int prev=s.nextInt();
        int count =2;
        int current;
        boolean isDec=true;
        while (count<=n) {
            current=s.nextInt();
            count++;
            if (current==prev) {
                System.out.println("false");
                return;

                
            }
            if (current<prev) {
                if (isDec==false) {
                    System.out.println("false");
                    return;
                    
                }
                
            }
            else{
                if (isDec==true) {
                    isDec=false;
                    
                }
            }
            prev=current;

            
        }
        System.out.println("true");
    }

}
