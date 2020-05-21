package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger","Lion","Monkey","Turtle","Crocodile"};
        String[] birds ={"Eagle","Ducks", "Peacock","Chicken"};

        String[][] zoo = { wildAnimals,birds };

        String kfc = zoo[1][3];//"Chicken"

        System.out.println(kfc);

        System.out.println("============================");

        for(String eachBird : zoo[1]){

            if(eachBird.equals("Chicken")){ // chicken haric butun kuslar
                continue;
            }

            System.out.println(eachBird);
        }

        System.out.println();

        for(String eachWild : zoo[0]){
            if(eachWild.equals("Turtle")); // turtle haric butun wild
            System.out.println(eachWild);
        }

        System.out.println("===============");

        // butun zoo yu print yapmak icin
           System.out.println(Arrays.deepToString(zoo));

           //[[Tiger, Lion, Monkey, Turtle, Crocodile], [Eagle, Ducks, Peacock, Chicken]]
        }


    }

