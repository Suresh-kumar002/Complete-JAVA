
public class Function_arg {

    public static void update(int marks []){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+2;
        }
    }
    public static void main(String[] args) {
        int marks[]={98,95,94};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
