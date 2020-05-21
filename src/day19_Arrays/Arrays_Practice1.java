package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] names ={"Gul", "Beyza", "Sener", "Yusuf"};
                 //        0       1        2       3
       /*
        System.out.println( names[2] );

        String s1 = names[1];
        System.out.println(s1);
      */

       for(int i =0; i<=3 ; i++){
           System.out.println(names[i]);
       }

       String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

       //print out all the users who registered with their gmail
        //max: 4

        for(int i =0; i<=3; i++){

            String email= emails[i];

            if(email.endsWith("@gmail.com")){

             System.out.println(email);
            }

        }




    }
}
