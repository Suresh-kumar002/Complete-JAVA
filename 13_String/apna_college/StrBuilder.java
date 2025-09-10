package apna_college;
public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        //O(n)
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
