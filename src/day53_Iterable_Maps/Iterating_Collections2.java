package day53_Iterable_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf","Yusuf"));

        System.out.println(names); //[Gul, Beyza, Yusuf, Sener, Cinna]  removed duplicates


        Iterator<String> it = names.iterator(); //prefered name--> it

        while(it.hasNext()){

            String s = it.next();
            if(s.toLowerCase().contains("e")){
                //if(s.contains("e") || s.contains("E")) //ayni demek yukardakiyle
                it.remove();
            }
        }

        System.out.println(names); //[Gul, Yusuf, Cinna]



        System.out.println("**************FOR LOOP ILE***********************************");

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf","Yusuf"));


        for(Iterator<String> I = students.iterator(); I.hasNext();){
            String s = I.next();
            if(s.contains("e") || s.contains("E")){
                I.remove();
            }
        }

        System.out.println(students); //[Gul, Yusuf, Cinna]



        System.out.println("***************PREDICATE ILE***************************");


        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList( "Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf","Yusuf"));


        n.removeIf( p-> p.contains("e") ||p.contains("E"));

        System.out.println(n); // [Gul, Yusuf, Cinna]


          //BULK OPERATIONS
        System.out.println("*************REMOVE ALL ************************");
 //en kisa yol
        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList( "Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf","Yusuf"));

        T.removeAll(Arrays.asList("Gul","Yusuf")); //bulk operation method

        System.out.println(T);  // [Beyza, Sener, Cinna]



        System.out.println("==================RETAIN ALL================================");
 //opposite of remove all

        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList( "Gul","Beyza","Yusuf","Sener","Cinna","Beyza","Yusuf","Yusuf"));

        R.retainAll(Arrays.asList("Cinna","Beyza"));// bunlar kalicak, digerleri gidecek

        System.out.println(R);  // [Beyza, Cinna]

        System.out.println("======================================================");


        List<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,4,2,1));

         //verify 5,6,9,8 contained in the list

        boolean result = list.containsAll(Arrays.asList(5,6,9,8));//hepsi varsa true veriyor, && logic gibi calisiyor

        System.out.println(result); //true
        System.out.println( list.containsAll(Arrays.asList(5,6,9,8,14) ));//false






    }
}
