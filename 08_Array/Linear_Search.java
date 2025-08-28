public class Linear_Search {
    public static int linearSearch(int num[],int val){
        for(int i=0; i<num.length; i++ ){
            if (num[i]==val) {
                return i;       
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num []={2,34,5,6,3,2,1,52,45,4,5,67,8,9};
        // int val=87;
        int val=21;
        
        int index=linearSearch(num, val);
        // System.out.println(index);
        if (index==-1) {
            System.out.println("Not found");
            
        }else{
            System.out.println("val is at index:- " + index);
        }
    }

}
