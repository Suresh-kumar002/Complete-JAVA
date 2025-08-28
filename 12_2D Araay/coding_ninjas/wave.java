package coding_ninjas;

import java.util.Scanner;

public class wave {
    public static int[][] TakeInput(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row=s.nextInt();
        System.out.print("Enter the col : ");
        int col=s.nextInt();
        System.out.println("Enter the elements : ");
        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }
    public static void printArr(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        System.out.println("Origional 2d arr : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void wavePrint(int arr[][]){
       int rown=arr.length;
       if (rown==0) {
            return;
        }
        int coln=arr[0].length;
        for(int j=0; j<coln; j++){
            if (j%2==0) {
                for(int i=0; i<rown; i++){
                    System.out.print(arr[i][j]+" ");

                }
            }else{
                for(int i=rown-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]=TakeInput();
        printArr(arr);
        System.out.println("wave print : ");
        wavePrint(arr);
        
    }

}
