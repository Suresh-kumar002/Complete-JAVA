package coding_ninjas;

import java.util.Scanner;

public class two_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int row=s.nextInt();
        System.out.println("Enter the cols : ");
        int col=s.nextInt();
        int input[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter element at "+ i+" rows "+j+" col ");
                input[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }

}
