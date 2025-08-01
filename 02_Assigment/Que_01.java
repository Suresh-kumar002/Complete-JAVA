import java.util.Scanner;
public class Que_01 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        if(c==1){
            int sum =0,num=1;
            while(num<=n){
                sum +=num;
                num++;

            }
            System.out.println(sum);

        }
        else if(c==2){
            int product=1,num=1;
            while(num<=n){
                product *=num;
                num++;
            }
            System.out.println(product);
        }
        else{
            System.out.println("-1");
        }
    }

}
