package day21_MultiDimensional_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // for(DataType variableName : ArrayName ){}


        int[] nums = {1,2,3,4};

        for(int eachElement :nums){

            System.out.println(eachElement);
        }

        System.out.println("************************************");

        String[] students = {"Muhtar", "Asiya", "Murodil"};

        for(String eachStudent : students){

            System.out.println(eachStudent);
        }
        System.out.println("************************************");

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for(int eachNum : arr1){
            if(eachNum<5){
                continue;
            }
            System.out.println(eachNum); // 5,6,7,8,9,10
        }
        System.out.println("************************************");

        String sentence = "I like Java"; // Java like I

        String[] words = sentence.split(" "); //[I, like, Java]
        for(String eachWord : words){
            System.out.println(eachWord);
        }


        System.out.println("=====================================");

        for(int i =words.length-1; i>=0; i--){
            System.out.print(words[i]+" "); //Java like I
        }

    }
}
