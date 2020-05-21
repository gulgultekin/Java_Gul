package Tasks;

public class Calisma14_Array_Unique_Number {
    public static void main(String[] args) {
     // find the unique number

        int[] arr = {1, 1, 2, 2, 4, 33, 33};


        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    count++;
                }


            }
            if (count == 1) {
                System.out.println(arr[j]);
            }

        }






    }
}
