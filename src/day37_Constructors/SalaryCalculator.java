package day37_Constructors;

public class SalaryCalculator {
    /*
    Task03:
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

   public SalaryCalculator(double hourlyRate,int weeklyHours,double stateTaxRate,double federalTaxRate){
       this.hourlyRate = hourlyRate;
       this.weeklyHours =weeklyHours;
       this.stateTaxRate = stateTaxRate;
       this.federalTaxRate = federalTaxRate;
   }

   public double salary(){
       double result= (hourlyRate*weeklyHours*48); //annual salary 48 weeks
       return result;
   }


   public double stateTax(){

       return stateTaxRate*salary();
   }

   public double federalTax(){

       return federalTaxRate*salary();
   }

    public double salaryAftertax() { //salary after tax

        return salary()-(stateTax()+federalTax());
    }


    public String toString(){
       return "Hourly rate: "+hourlyRate+" weekly hours: "+weeklyHours+" gross salary: "+salary()
               +" state tax: "+stateTax()+" federal tax: "+federalTax()+" Net Salary: "+salaryAftertax();
   }
}

class employeeSalary {

    public static void main(String[] args) {

        SalaryCalculator income = new SalaryCalculator(15,40,0.08,0.26);
        System.out.println(income.stateTax());                                          //8.25/100      26/100
        System.out.println(income.federalTax());
        System.out.println(income.salaryAftertax());
       System.out.println(income);




    }



}
