package coding_ninjas;



public class string {

    public static void print(String s){
        for(int i=0; i<s.length(); i++){
            System.err.println(s.charAt(i));
        }
    }

    public static void printprefix(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.substring(0, i+1));
        }
    }
    public static void main(String[] args) {

        // int arr1[]={1,2,3};
        // // int arr2[]={1,2,3};
        // int arr2[]=arr1;

        // if (arr1==arr2) {
        //     System.out.println("Equal");
            
        // }else{
        //     System.out.println("unequal");
        // }
        // System.out.println(arr1);
        // System.out.println(arr2);

        String str1="abc";
        String st2="abc";

        if (str1.equals(st2)) {
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }
        // char s='c';
        String str="suresh";
        // System.out.println(str.charAt(1));
        // // System.out.println(str[1]); incorrect
        // System.out.println(str.length());
        // System.out.println(str.substring(1, 6));
        // System.out.println(str.substring(3));
        // System.out.println(str.substring(0));
        // // String temp=str.substring(str.length());
        // String temp=str.substring(str.length()+1);

        // System.out.println(str.substring(1,1));
        // System.out.println(temp.length());

        // System.out.println(str.contains("resh"));

        // String str="suresh";
        // str="syte";
        print(str);
        // str=str+"syre";
        // System.out.println(str);
        // System.out.println(str.concat("sureg"));
        // System.out.println(str);
        printprefix(str);

    }

}
