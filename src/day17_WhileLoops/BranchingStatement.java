package day17_WhileLoops;

public class BranchingStatement {

    public static void main(String[] args) {

        //System.exit(0):

        for(int i= 0; i<5; i++){
            if(i%2!=0){
            // continue;// skip yapiyor
           //  break;//sadece loop tan cikiyor.loop  disindakileri print yapiyor
             System.exit(0);//stops the entire program immediately. hepsini kapsiyor. closes everyting
            }
            System.out.println(i);
        }

        System.out.println("CountLetters complited");


    }
}
