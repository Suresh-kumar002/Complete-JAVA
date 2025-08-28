import java.util.Scanner;

public class Array_store01 {

    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input []=new int [size];
        for(int i=0; i<size; i++){
            input[i]=s.nextInt();
        }
        return input;

    }
    public static void print(int input []){
        int size=input.length;
        for(int a=0; a<size;a++ ){
            System.out.print(input[a] + " ");

        }
        System.out.println();
    }    

    public static void incement(int a){
        a++;
    }
    public static void incementArray(int arr[]){
      arr=new int[5];
      for(int a = 0; a < arr.length; a++){
        arr[a]++;
      }  
      
    }




    public static void main(String[] args) {
        
        // int a=100;
        // incement(a);
        // System.out.println(a);

        int arr[]={1,2,3,4,5};
        incementArray(arr);
        print(arr);
        // System.out.println(arr);
        // print(arr);

    }

}
