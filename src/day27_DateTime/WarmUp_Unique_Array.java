package day27_DateTime;

public class WarmUp_Unique_Array {
    /*
     3. write a method that can print out the unique elements from an int array
                    Ex: {1,1,2,3,3} ==> 2
                        {6,6,7,7,8,9} ==> 8 9
        4. write a method that can print out the unique elements from a double array
                    Note: Apply method overloading
     */

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,5};//2,5

        for(int each2: arr) {

            // arr[0]-->1
            int count = 0;
            for (int each : arr) {
                if (each == each2) { // arr[0]--> o yerine each2 yu koyuyoruz /
                                        // /regular for loop olsaydi each2--> i yerine
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[each2]);
            }
        }

        System.out.println("*****************************");

        int[] arr2 = {1,1,2,3,3,5,7,7,9};
        uniqueElement(arr2);

        System.out.println("*****************************");

       double[] arr3 = {1.3,1.3,2.2,3.3,3.3};
        uniqueElement(arr3);

    }


    public static void uniqueElement(int[] arr){
        for(int each2: arr) {

            // arr[0]-->1
            int count = 0;
            for (int each : arr) {
                if (each == each2) { // arr[0]--> o yerine each2 yu koyuyoruz /
                    // /for loop olsaydi each2--> i yerine
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
        }

    }

    public static void uniqueElement(double[] arr){
        for(double each2: arr) {
            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
        }


    }



}
