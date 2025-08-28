public class linear_string {
    public static int Linear_Search(String fruits [],String val){
        for(int i=0; i<fruits.length; i++){
            if (fruits[i].equals(val)) {
                return i;
                
            }
            
        }return -1;
        
    }
        public static void main(String[] args) {
        String fruits []={"mango","banana","apple","orange"};
        String val="banana";

        int index =Linear_Search(fruits, val);
        if (index==-1) {
            System.out.println("Not found");
            
        }else{
            System.out.println("val is index:- "+index);
        }
        // System.err.println("val of index:- "+Linear_Search(fruits, val));
       
    }

}
