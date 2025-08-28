public class Product_of_ab {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;

    }
    public static void main(String[] args) {
        int a=12;
        int b=2;

        int prod=multiply(a,b);
        System.err.println("a*b = "+prod);
        prod=multiply(10, 5);
        System.err.println("a*b = "+prod);
        
    }

}
