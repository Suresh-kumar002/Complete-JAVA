public class Largest {
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE; //+infinity
        for(int i=0; i<num.length; i++){
            if (largest<num[i]) {
                largest=num[i];
                
            }
            if (smallest>num[i]) {
                smallest=num[i];
            }

        }
        System.out.println("smallest value in given array:- "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,4,6,4,7,47,8,98,0};

        System.out.println("Largest value in given array:- "+getlargest(num));
    }

}
