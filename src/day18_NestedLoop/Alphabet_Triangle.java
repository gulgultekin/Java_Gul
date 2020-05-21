package day18_NestedLoop;

public class Alphabet_Triangle {
    public static void main(String[] args) {
        //make triangle with alphabet

        for (char z = 'a'; z <= 'e'; z++) { //vertical

            for (char ch = 'a'; ch <= z; ch++) { //horizantal

                System.out.print(ch + " ");
            }

            System.out.println();


        }
        System.out.println("==========================================");

        for (char z = 'z'; z >= 'a'; z--) { //vertical


            for (char ch = 'a'; ch <= z; ch++) { //horizantal

                System.out.print(ch + " ");
            }

            System.out.println();

        }

    }
    }

