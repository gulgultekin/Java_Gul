package Saturday_OfficeHours.day2_5_8_2020;

public class middleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("gul"));
    }
    public static String middleTwo(String str) {

        int mid1 = str.length()/2-1;
        int mid2 = str.length()/2;
        // String word = ""+str.charAt(mid1)+ str.charAt(mid2);
        // return word;

        return str.substring(mid1,mid2+1);
    }

}
