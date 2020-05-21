package day27_DateTime;

public class FindingMinimum {
    public static void main(String[] args) {

        int[]arr = {5,4,8,2};

        int minimum =arr[0]; // 2
        for(int each: arr){  // each: 5,4,8,2

            if(each< minimum){
                minimum = each;
            }
        }

        System.out.println(minimum);


        int[] arr2 ={33, 565, 33,2223, 8,-56,};
        int result = minimum(arr2);
        System.out.println(result);


        double[] arr3  = {44.56, 33.6, 5, -87.6, 33};
        System.out.println(minimum(arr3));

    }


    public static int minimum(int[] arr){

        int minimum =arr[0];
        for(int each: arr){
            if(each< minimum){
                minimum = each;
            }
        }
        return minimum;
    }


    public static double minimum(double[] arr){

        double minimum =arr[0];
        for(double each: arr){
            if(each< minimum){
                minimum = each;
            }
        }
        return minimum;
    }





}
