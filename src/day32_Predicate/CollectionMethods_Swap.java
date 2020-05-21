package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods_Swap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
          list.addAll(Arrays.asList(1,2,3,4,5)); // 1 ile 5 in yerini degistirmek istiyoruz

        System.out.println(list); //[1, 2, 3, 4, 5]
        //{5,2,3,4,1} istiyoruz

        Collections.swap(list,0,4);
        System.out.println(list); //[5, 2, 3, 4, 1]



        System.out.println("**********String ArrayList ile Swap*****************");


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Omer","Omer", "Sha","Reem","Omer")); // replace with Irina

//        names.set(0,"Irina");
//        names.set(1,"Irina");
//        names.set(4,"Irina");
//        System.out.println(names);  // [Irina, Irina, Sha, Reem, Irina] boyle uzun oluyor onun yerine
//                                 // replaceAll methoduyla yapmak daha kisa

        Collections.replaceAll(names,"Omer","Irina");

        System.out.println(names); //[Irina, Irina, Sha, Reem, Irina]


    }
}
