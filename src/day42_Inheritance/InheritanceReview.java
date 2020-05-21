package day42_Inheritance;

import Resources.Inheritance;

class B{
    public B(int a){
        System.out.println("int");
    }

    public B(double a){
        System.out.println("double");
    }

    public B(long a){
        this(2.5);
        System.out.println("long");
    }
}


public class InheritanceReview extends B{

    public InheritanceReview(String a){
        super(19L); // parent classtan 1 constructor cagirmamiz lazim //double long

        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview("Hello"); //double long string
    }
}
