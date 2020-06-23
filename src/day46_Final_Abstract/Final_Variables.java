package day46_Final_Abstract;

public class Final_Variables {

    final int InstanceVariable = 300; //degistirilemez
   //  final  int InstanceVariable2 ;  // final instance variables need to be initialized immedietly
                                     //yoksa hata verir
    final static int staticVariables = 1000;

    //  final static int getStaticVariables2; // final static variables need to be initialized immedietly
                                               //yoksa hata verir
    public static void main(String[] args) {
        final double PI = 3.14;
        //  PI = 3.15;

        final String gender = "Male";
        //   gender = "Female";

        final int score;
        score = 100;
        // score = 200;//you can not reassign
        System.out.println(score);

        System.out.println("==============================");

        // this.InstanceVariable = 400;//obje olusturup cagirmamiz lazim

        Final_Variables obj = new Final_Variables();

        //obj.InstanceVariable = 400;//hata verir cunku final

        // staticVariables = 2000;//static variable final olmasa tekrar reassign yapilabilir
              //ama final olunca degistirilemez


    }
}
