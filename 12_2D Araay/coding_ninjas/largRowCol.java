package coding_ninjas;

import java.util.Scanner;



public class largRowCol {
    public static int[][] TakeInput(){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=s.nextInt();
            }
            
        }
        return arr;
    }
    public static void print(int arr[][]){
        int row=arr.length; 
        int col=arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int lagestColSum(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int row=arr.length;
        int col=arr[0].length;

        for(int j=0; j<col; j++){
            int sum=0; 
            for(int i=0; i<row; i++ ){
                sum=sum+arr[i][j];
            }
            if (sum>largest) {
                largest=sum;
            }
        }
        return largest;
    }
    public static int lagestRowSum(int arr[][]){
        int largestrow=Integer.MIN_VALUE;
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0; i<row; i++){
            int sum=0; 
            for(int j=0;j<col; j++ ){
                sum=sum+arr[i][j];
            }
            if (sum>largestrow) {
                largestrow=sum;
            }
        }
        return largestrow;
    }

    public static void main(String[] args) {
        int arr[][]=TakeInput();
        print(arr);
        System.out.println("sum of col Largest : "+lagestColSum(arr));
        System.out.println("sum of row Largest : "+lagestRowSum(arr));
    }
    
}
