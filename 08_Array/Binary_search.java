import java.util.Scanner;

public class Binary_search {
    public static int binary_search(int num [],int key){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            //comparisons
            if (num[mid]==key) { //mid
                return mid;
                
            }
            if (num[mid]<key) { //Right
                start=mid+1;
                
            }else{ //left
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,7,8,9,13};
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key=s.nextInt();
        // int key=2;

        System.out.println("Index for key is : "+binary_search(num, key));
    }

}
