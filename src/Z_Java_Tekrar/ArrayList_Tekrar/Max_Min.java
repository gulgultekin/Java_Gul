package Z_Java_Tekrar.ArrayList_Tekrar;
import java.util.ArrayList;
import java.util.Arrays;
public class Max_Min {
     /*
    Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
     */
     public static void main(String[] args) {
         String[] arr = {"1","2.5", "3", "3.5", "4.5"};
        double max = Double.MIN_VALUE ;

        for(String each: arr){
            double num = Double.parseDouble(each);
            if(num>max){
                max=num;
            }
        }
         System.out.println(max);

         System.out.println("***********************");


         String[] arr2 = {"100","2.5", "3.5", "4.5", "9.5","100.7","3"};
         double[] numbers = new double[arr2.length];

        for(int i=0; i< arr2.length; i++){
            numbers[i]= Double.parseDouble(arr2[i]);

        }
         System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));
         double maxx = numbers[numbers.length-1];
         System.out.println(maxx);
     }
}
