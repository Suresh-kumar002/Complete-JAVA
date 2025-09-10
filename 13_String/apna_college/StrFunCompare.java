package apna_college;
public class StrFunCompare {
    public static void main(String[] args) {
        String s1="suryaa";
        String s2="suryaa";

        String s3=new String("suryaa");

        if (s1==s2) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    //     if (s1==s3) {
    //         System.out.println("String are equal");
    //     }
    //     else{
    //         System.out.println("String are not equal");
    //     }

        if (s1.equals(s3)) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }

}
