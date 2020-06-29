package Z_Java_Tekrar.OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteretaorPractice {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,5));


    for(Iterator<Integer>it = list.iterator(); it.hasNext();){
        if(it.next()<4){
            it.remove();
        }
    }
        System.out.println(list);


        LinkedHashSet<String>names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf"));
        System.out.println(names);

       // names.removeIf(p->p.contains("e") || p.contains("E"));

       // names.removeAll(Arrays.asList("Yusuf"));

       // names.retainAll(Arrays.asList("Beyza"));

        boolean bool = names.containsAll(Arrays.asList("Yusuf"));

        System.out.println(names);


        System.out.println(bool);




    }
}
