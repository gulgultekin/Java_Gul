package Z_Java_Tekrar;

public class final_Keyword {
    final int score=100;


    public void method(int score){
        score=300;
        System.out.println(score);
    }

    public static void main(String[] args) {

        final_Keyword obj = new final_Keyword();
        System.out.println(obj.score);//100

        final int score;
        score=200;

        System.out.println(score);//200
    }
}
