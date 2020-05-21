package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
             //  sub                super

    // only public and protected inherited outside the package

    public static void main(String[] args) {

        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        //System.out.println(Inheritance2.defaultVariable);

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();


    }





}
