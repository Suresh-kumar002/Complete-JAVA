package coding_ninjas;

public class subString {
    public static void printsubstring(String str){
        for(int start=0; start<str.length(); start++){
            for(int end =start+1; end<=str.length(); end++){
                System.out.println(str.substring(start, end));
            }
        }

    }
    public static void PrintSubString2(String str){
        for(int len=1; len<=str.length(); len++){
            for(int start =0; start<=str.length()-len; start++){
                int end=start+len;
                System.out.println(str.substring(start, end));
            }
        }
    }
    public static void main(String[] args) {
        String str="suresh";
        printsubstring(str);
        System.out.println();
        PrintSubString2(str);
        
    }

}
