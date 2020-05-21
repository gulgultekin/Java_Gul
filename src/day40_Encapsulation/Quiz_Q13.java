package day40_Encapsulation;

public class Quiz_Q13 {

    int score; //instance variable

    Quiz_Q13(){ //instance variable constructorda yazabiliriz
        score= 65;
    }

    { //instance variable instance blockta yazabiliriz
        score= 75;
    }


//    static{ //instance variable static blockta yazamayiz hata verir
//        score =55;
//    }

    public static void main(String[] args) {
        Quiz_Q13 obj = new Quiz_Q13();
       // System.out.println(score);
    }


}
