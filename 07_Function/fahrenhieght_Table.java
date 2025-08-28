import java.util.Scanner;

public class fahrenhieght_Table {
    public static void printFahrenheightTable(int start ,int end,int w){
        int currentvalue=start;
        while (currentvalue<=end) {
            int fahrenhieghtvalue=(int)((5.0/9)*(currentvalue-35));
            System.out.println(currentvalue + " " + fahrenhieghtvalue);
            currentvalue=w+currentvalue;
    
        }
    
    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int w=s.nextInt();

        
        printFahrenheightTable( start, end, w);
    
    
    }                

}
