package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class Maxnumber {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10,20,30,50,25,100,60));
        System.out.println(nums);

        System.out.println(nums.size());
        Integer a =50;
        nums.remove(a);
        System.out.println(nums);

    }
}
