package Replits;

import java.util.ArrayList;

public class ArrayList_181 {
    public static void main(String[] args) {
        String[] a = {"f","o","o"};
        String[] b = {" b","a","r"};
        System.out.println( combineRs(a,b) );

    }

    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> result = new ArrayList<>();
        String res ="";

        for(int i=0; i<r1.length; i++){
            result.add(r1[i]);
        }
        for(String each: r2){
            result.add(each);
        }

        for (String ea:result) {
            res += ea;

        }

        return res;
    }

}
