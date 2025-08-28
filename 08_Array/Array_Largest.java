import java.util.Scanner;

public class Array_Largest {

    public static int LargestInAraay(int input[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<input.length; i++){
            if (input[i]>max) {
                max=input[i];
                
            }
            if(input[i]<min){
                min=input[i];
            }
        }
        System.out.println("smallest value is: " + min);
        
        return max;
    }
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input []=new int [size];
        for(int i=0; i<size; i++){
            input[i]=s.nextInt();
        }
        return input;
        
    }
    public static void print(int input[]){
        int size=input.length;
        for(int i=0; i<size; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
       System.out.print("Enter the size of array: ");
       int arr[] =takeInput();
       print(arr);
       
       
    int Largest=LargestInAraay(arr);
    System.out.println("Largest value is :" + Largest);

    }

}
