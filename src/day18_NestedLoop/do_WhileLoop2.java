package day18_NestedLoop;

public class do_WhileLoop2 {
    public static void main(String[] args) {

        int number = 103; // print the number between 100 ~number

        while(number>=100){
            System.out.println(number);
            number--;
        }
        System.out.println("************************");

        //do while loop ile---> condition false olsa bile 1 kez print yapar

        int number2 =103;

        do{
            System.out.println(number2);
            number2--;

        }while(number2>=100);

    }
}
