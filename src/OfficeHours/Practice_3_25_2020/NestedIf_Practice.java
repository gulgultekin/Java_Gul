package OfficeHours.Practice_3_25_2020;

public class NestedIf_Practice {
    public static void main(String[] args) {

        byte weekDays = 5;
        if (weekDays > 0 && weekDays < 8) {
            if (weekDays == 1) {
                System.out.println("Monday");
            } else if (weekDays == 2) {
                System.out.println("Tuesday");
            } else if (weekDays == 3) {
                System.out.println("Wednesday");
            } else if (weekDays == 4) {
                System.out.println("Thursday");
            } else if (weekDays == 5) {
                System.out.println("Friday");
            } else if (weekDays == 6) {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Invalid Entry");
        }


        //ternary ile

        int num = 3;
        String days = "";
        if (num > 0 && num < 8) {
            days = (num==1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday": (num == 6) ? "Saturday" : "Sunday";
        }
        else {
            days = "Invalid number";
        }
        System.out.println(days);
    }
}
