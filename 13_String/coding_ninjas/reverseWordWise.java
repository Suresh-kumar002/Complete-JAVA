package coding_ninjas;

public class reverseWordWise {
    public static String Reversewword(String str){
        String result="";
        int i=str.length()-1;
        int end=str.length();

        while (i>=0) {
            if (str.charAt(i)==' ') {
                result=result+str.substring(i+1, end)+" ";
                end=i;
                
            }
            i--;
        }
        result=result+str.substring(i+1, end);

        return result;
        
    }
    public static void main(String[] args) {
        String str="suresh tanwar";
        String result=Reversewword(str);
        System.out.println(result);
        
    }

}
