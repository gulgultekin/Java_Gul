package OfficeHours.Practice_04_22_2020;

public class Return_Method {

    public static void main(String[] args) {

        int num1 = sum(7, 19); // return method

        System.out.println(num1);

        System.out.println("**********************");
        String str = "Cybertek";

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

        System.out.println("================================");

        //pallindrome

        String str2 = "level";
        String name = reverse(str2);
        System.out.println(name);
        System.out.println(name.equalsIgnoreCase(str2));
    }


    public static int sum(int a, int b) {
        return a + b;
    }


    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}