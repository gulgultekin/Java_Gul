package Tasks;

public class Calisma08_SwitchCase {
    public static void main(String[] args) {
        /*
        Write a program to display days:
        1-Monday2-Tuesday3-Wednesday4-Thursday5-Friday6-Saturday
         */

        byte num=2;
        String days="";
        switch(num){
            case 1:
                days="Monday";
                break;
            case 2:
                days="Tuesday";
                break;
            case 3:
                days="wednesday";
                break;
            case 4:
                days="Thursday";
                break;
            case 5:
                days="Friday";
                break;
            case 6:
                days="Saturday";
                break;
            case 7:
                days="Sunday";
                break;
            default:
                days="Invalid entry";
                break;
        }

        System.out.println("Today is "+days);


    }
}
