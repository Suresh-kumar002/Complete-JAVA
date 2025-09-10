package coding_ninjas.assigment;

import java.util.Scanner;

public class CheckPremutation {
    public static boolean checkPremutation(String str1,String str2){
        if (str1.length()!=str2.length()) {
            return false;
            
        }
        int frequescy[]=new int[256];
        for(int i=0; i<256; i++){
            frequescy[i]=0;
        }
        for(int i=0; i<str1.length(); i++){
            char ch=str1.charAt(i);
            ++frequescy[ch];
        }
        for(int i=0; i<str2.length(); i++){
            char ch=str2.charAt(i);
            --frequescy[ch];
        }
        for(int i=0; i<256; i++){
            if (frequescy[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();

        System.out.println(checkPremutation(str1, str2));
    }

}
