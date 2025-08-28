public class SubArray {
    public static void subarray(int num[]){
        int tp=0;
        int totalSum = 0;
        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                int subSum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k]+" ");//subarray
                    subSum += num[k];
                }
                totalSum += subSum;
                tp++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("totel subarray : "+tp);
         System.out.println("Total sum of all subarrays: " + totalSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        subarray(num);
    }

}
