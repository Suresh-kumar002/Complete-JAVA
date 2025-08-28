import java.util.Scanner;

public class ArraySum {
    public static int SUM(int input[]) {
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            ans += input[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = s.nextInt();  // Read array size
        
        int input[] = new int[n];  // Declare array

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();  // Fill array
        }
        // int input[]={1,2,3,4};

        int sum = SUM(input);  // Call SUM function
        System.out.println("Sum = " + sum);  // Print result
    }
}
