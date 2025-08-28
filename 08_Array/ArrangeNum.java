import java.util.Scanner;

public class ArrangeNum {

    public static void  arrange(int arr[],int n){
        int left=0;
        int right=n-1;
        int number=1;

        while (left<=right) {
            if(number%2==1){
               arr[left] = number;
               number++;
               left++;
            }
            else{
                arr[right]=number;
                number++;
                right--;
            }   
            
        }    

        // while (left<right) {
        //     arr[left] = number++;
        //     arr[right] = number++;
        //     left++;
        //     right--;
        // }    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=s.nextInt();

        int[] arr = new int[n];
        arrange(arr, n);

        for (int left = 0; left < n; left++) {
            System.out.print(arr[left] + " ");
        }
       
    }

}
