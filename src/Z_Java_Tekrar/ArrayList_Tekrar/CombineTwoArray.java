package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;

public class CombineTwoArray {
    /* 5. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> result = new ArrayList<>();


        for(int i=0; i< arr1.length; i++){
            result.add(arr1[i]);
        }
        for(int i=0; i< arr2.length; i++){
            result.add(arr2[i]);
        }
        System.out.println(result);
    }
}
