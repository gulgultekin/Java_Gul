package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {

    public static void main(String[] args) {


        System.out.println(PersonalInfo.name); // public

        System.out.println(PersonalInfo.gender);//public

        //System.out.println(PersonalInfo.age); default old icin ayni package de kullanilabilir
        //default only accessible in the same package
        //System.out.println(PersonalInfo.SSN); // private

       //System.out.println(PersonalInfo.ID); // private

        //even if you import the package default and private are not accessable

        PersonalInfo obje = new PersonalInfo();
        System.out.println(obje.name); //public
        System.out.println(obje.name); //public
        //System.out.println(obje.age); // default access modifier
        System.out.println(obje.gender); //public
         //System.out.println(obje.SSN); //private
    }
}
