package day36_StaticBlock;

public class Test {

    public static void main(String[] args) {

        System.out.println( StaticBlock2.tester1 );

       //staticBlock2 de set info main methodun icinde yazilinca hic bir info set olmadi,null verdi.
       // ama static methodun icinde yazinca ilk static method run yaptigi icin butun bilgiler execute yapti


        System.out.println(StaticBlock3.name); // static old icin class adiyla cagiriyoruz
        System.out.println(StaticBlock3.num);


    }




}
