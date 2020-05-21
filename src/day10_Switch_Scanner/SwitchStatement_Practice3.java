package day10_Switch_Scanner;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        /*
        Create a new switch statement using char instead of int.
        Create a new char variable
        Create a switch statement testing for A, B, C, D or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found.
         */
        char ch = 'a';

        switch (ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Invalid");


                // bu sekilde de yazilabilir


                char ch1 = 'a';
                String result = "";

                switch (ch1) {
                    case 'A':
                        result = "A";
                        break;
                    case 'B':
                        result = "B";
                        break;
                    case 'C':
                        result = "C";
                        break;
                    case 'D':
                        result = "D";
                        break;
                    case 'E':
                        result = "E";
                        break;
                    default:
                        result = "Invalid";


                }
                System.out.println(result);


                //
                char ch2 = 'A';
                String result2 = "";

                switch (ch2) {
                    case 'A':
                        result2 += "A";// + old icin concatinate yapiyor hepsini, ve break yok

                    case 'B':
                        result2 += "B";

                    case 'C':
                        result2 += "C";

                    case 'D':
                        result2 += "D";

                    case 'E':
                        result2 += "E";

                    default:
                        result2 += "Invalid";


                }
                System.out.println(result2);

/*
        }
        char ch1 = 'a';
        String result = "";

        switch (ch1) {
            case 'A':
                result = "A";
                break;
            case 'B':
                result = "B";
                break;
            case 'C':
                result = "C";
                break;
            case 'D':
                result = "D";
                break;
            case 'E':
                result = "E";
                break;
            default:
                result = "Invalid";


        }
        System.out.println(result);
        */
                char ch3 = 'A';

                switch (ch3) {
                    case 'A':
                        System.out.println("A");

                    case 'B':
                        System.out.println("B");

                    case 'C':
                        System.out.println("C");

                    case 'D':
                        System.out.println("D");

                    case 'E':
                        System.out.println("E");

                    default:
                        System.out.println("Invalid");
        // bu sekilde break yoksa hepsi print olur

                }
        }
    }
}
