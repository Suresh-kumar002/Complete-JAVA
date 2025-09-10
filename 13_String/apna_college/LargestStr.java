package apna_college;
public class LargestStr {
    public static void main(String[] args) {
        String fruits[]={"surya","darshna","harshita","sanjay","nilam","divya"};
        String largest=fruits[0];

        for(int i=1; i<fruits.length; i++){
            if (largest.compareTo(fruits[i])<0) {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }

}
