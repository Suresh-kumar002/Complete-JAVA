package coding_ninjas;

import java.util.Scanner;

public class sum {
    public static void SumRow(int arr[][]){
        int row=arr.length;
        if (row==0) {
            return;
        }
        int col=arr[0].length;
        for(int i=0; i<row; i++){
            int rosum=0;
            for(int j=0; j<col; j++){
                rosum+=arr[i][j];
            }
            System.out.println(rosum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int row=s.nextInt();
        System.out.println("Enter the cols : ");
        int col=s.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter element at "+i+" rows "+j+" colums ");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of row : ");
        SumRow(arr);


    }

}
