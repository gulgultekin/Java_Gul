package day45_Exception;

public class Warm_Up {

    //do pushUps 20 times
    public static void main(String[] args) {

        int pushUps =0;
        while(pushUps<50){
            System.out.println("Pushup "+(pushUps+1));

            try {
                Thread.sleep(300);
            }catch(Exception e){

            }
            pushUps++;
        }





    }
}
