package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

        System.out.println( obj1.defaultAccess);// ayni packageden default access modifier cagirilabilir

        System.out.println(obj1.publicAccess); // outside of the packageden de gelir--open to the world

       // System.out.println(obj1.ssn);// private old icin direk gelmiyor--> acsess denied-
                                     // private only accessible within the class


    }


}
