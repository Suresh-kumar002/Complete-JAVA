import java.util.Scanner;

public class Two_D {
    public static boolean Search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key) {
                    System.out.println("fount at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int a=s.nextInt();
        System.out.print("Enter the col : ");
        int b=s.nextInt();
        System.out.println("Enter the element : ");
        int matrix[][]=new int[a][b];
        int n=matrix.length,m=matrix[0].length;

       
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix :-");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(matrix, 3);
    }
    

}
