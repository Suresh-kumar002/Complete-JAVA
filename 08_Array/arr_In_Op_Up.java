import java.util.Scanner;

public class arr_In_Op_Up {
    public static void main(String[] args) {
        int marks []=new int[100];
        Scanner s=new Scanner(System.in);
        
        System.out.println("Length of array : " +marks.length); //find the array lenth use for .length


        //input 
        marks[0]=s.nextInt();
        marks[1]=s.nextInt();
        marks[2]=s.nextInt();

        // //op in array
        System.out.println("physic : " + marks[0]);
        System.out.println("Chemistry : " +marks[1]);
        System.out.println("Maths : " + marks[2]);

        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : " +percentage + "%");


        // //update
        // marks[2]=marks[2]+3;
        // System.out.println("Maths : " + marks[2]);
        // marks[1]=100;
        // System.out.println("Chemistry : " +marks[1]); 

    }

}
