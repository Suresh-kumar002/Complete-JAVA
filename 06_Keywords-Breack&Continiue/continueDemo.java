public class continueDemo {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            
            if (i==5) {
                i++;
               continue;
                
            }
            System.out.println(i);
            i=i+1;
            
        }
        System.out.println();
        for(int k=1; k<=10;k++){
            if (k==5) {
                continue;
                
            }
            System.out.println(k);
        }
    }

}
