package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {

        /*
        1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    */
        double gallon = 1;
        double litter = gallon * 3.785;
        String result = gallon + "  gallons  = " + litter + " litters";

        System.out.println(result);



        /*
        2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
   */

        double lt = 5;
        double gal = lt/ 3.785;

        System.out.println(lt + " litters = "+ gal + " gallons");

        /*
        3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

         */

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
            // -200 +-200 * 200 % 2
            // -200 + -40000 % 2
          //  -200 + 0
          //b =-200
        System.out.println(b); // -200
        System.out.println(a); // 199


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        // 300 + 400 - 300 * 400 + 300/400
        // 300 + 400 - 120000 + 0
        //700 -120000
        // -119300
        System.out.println(z); // -119300

    }
}
