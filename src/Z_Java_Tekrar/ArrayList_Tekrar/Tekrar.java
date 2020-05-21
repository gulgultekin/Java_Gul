package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {
        Integer[]arr={1,2,3,4};

        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

    }
}
