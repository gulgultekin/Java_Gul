package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(1,3,5,7,8,2,8,0));

        System.out.println(list);

        Predicate<Integer> oddNum= p-> p%2 == 0;
        list.removeIf(oddNum);
        System.out.println(list);
    }
}
