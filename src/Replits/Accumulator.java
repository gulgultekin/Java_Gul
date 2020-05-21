package Replits;

public class Accumulator {
    /*
    Write a class named Accumulator containing:
An instance variable named sum of type integer.

A constructor that accepts an integer parameter,
whose value is used to initialize the sum instance variable.

A method named getSum that returns the value of sum.
A method named add that accepts an integer parameter.

The value of sum is increased by the value of the parameter.
A method named remove that accepts an integer parameter.
The value of sum is decreased by the value of the parameter.

Override a toString method so it returns 'Sum is: X' where X is the sum instance variable.
     */
    int sum;

    public Accumulator(int sum){
        this.sum =sum;
    }

    public int getSum(){
        return this.sum;
    }

    public void add(int a){
        sum+=a;
    }
    public void remove(int b){
        sum-=b;
    }

    public String toString(){
        return "Sum is: "+sum;
    }

}

class Test2{
    public static void main(String[] args) {
        Accumulator obj = new Accumulator(5);
        System.out.println(obj.toString());

    }

}
