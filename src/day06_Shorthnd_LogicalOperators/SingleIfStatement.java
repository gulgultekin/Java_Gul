package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = true;

        if(coldWeather) {
            //true verince print yapacak
            System.out.println("Wear your hat ");
            System.out.println("Wear your jacket ");
        }


        boolean coronaDetected = false;
        // false old icin hicbir sey print yapmiyor
        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water ");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }


        System.out.println("======================================");

        int a = 101;
        boolean evenNumber = a % 2 == 0; //if a number can be divided by 2 without the remainder
        //boolean oddNumber = a %2 != 0; //if the number cannot be divided by 2 evenly
        if (evenNumber){
            System.out.println(a + " is even number ");


        }
        /*if(oddNumber){
            System.out.println(a+ " is odd number");
        } */
        if (!evenNumber){ // if the number is not even number, then must be odd
            System.out.println(a+ " is odd number" );
        }


    }
}
