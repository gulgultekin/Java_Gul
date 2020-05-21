package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.publicAccess); //open to the world

        // System.out.println(obj.defaultAccess); hata veriyor. Cunku baska package de old default gelmez
        // default only accessible within same package


        //System.out.println(obj.ssn); // access denied-  private only accessible within the class



    }


}
