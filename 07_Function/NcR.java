public class NcR {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f; //factorial of n
    }
    public static int BInomialCof(int n,int r){
        int bi_n=factorial(n);
        int bi_r=factorial(r);
        int bi_nmr=factorial(n-r);

        int BinCOff=bi_n/(bi_r*bi_nmr);
        return BinCOff;
        
    }
    public static void main(String[] args) {
        
        System.out.println(BInomialCof(5, 2));
        
    }

}
