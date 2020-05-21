package Tasks;


public class SalarycalculatorTask08 {
     /* Create a class called salary calculator,
    write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rates
    */
    public static void main(String[] args) {

       int rate = 55;
        int weeklyHours = 40;

        int salary = (rate*(48*weeklyHours));
        double stateTax = (0.04* salary);
        double federalTax = (0.22*salary);
        double totalTax = stateTax + federalTax;

        double incomeAfterTax = salary-totalTax;


        System.out.println("your salary is :" + salary+" USD"+"\nyour total tax is : "+ totalTax +" USD"
                + "\nyour income after tax is : "+ incomeAfterTax + " USD");



    }
}
