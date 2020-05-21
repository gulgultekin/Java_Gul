package Tasks;

public class Calisma08_SwitchCase2 {
    public static void main(String[] args) {
        /*
        Create a new switch statement using char instead of int.
        Create a new char variable
        Create a switch statement testing for A, B, C, D or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found.
         */

        char ch= 'A';
        switch (ch){
            case'a':
            case'A':
               System.out.println("char value is :A");
               break;
            case'B':
            case'b':
                System.out.println("char value is :B");
                break;
            case'c':
                System.out.println("char value is :C");
                break;
            case'd':
                System.out.println("char value is :D");
                break;
            case'e':
            case'E':
                System.out.println("char value is :E");
                break;

        }

    }
}
