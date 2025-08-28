package Assigment;
public class Sum {
    public static void main(String[] args) {
        int nums[][]={{1,4,9},
                     {8,8,7}};
        int sum =0;

       //sum of 2nd row elements
        for(int j=0; j<=nums.length; j++){
            sum +=nums[1][j];
        }
        System.out.println("sum is : "+sum);

    }
    
}
