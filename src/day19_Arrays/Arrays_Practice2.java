package day19_Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println(arr.length); //3


        int[] arr2 = new int[5];

        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]); //0


        String[] Testers = new String[3]; // {Reem, madina,zeynep}
                 // index: 0, 1, 2

        Testers[0] ="Reem";
        Testers[2] ="Zeynep";


        System.out.println(Testers[0]); //reem
        System.out.println(Testers[1]);// default value -->null
        System.out.println(Testers[2]); //zeynep

        System.out.println(Testers.length); //3

        System.out.println("====================================");







    }
}
