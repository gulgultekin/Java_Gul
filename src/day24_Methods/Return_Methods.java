package day24_Methods;

public class Return_Methods {

    public static void maxNum(int a, int b){

        if(a >= b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }


    public static void main(String[] args) {
                                //  public static void main(String[] args) olunca
      //  int a = maxNum(10,20); // baska value assign yapamiyoruz cunku sadece fuction yapiyor


       int result =  addition(10,20); //30

        System.out.println(result);

        int result2 = result+200;//230

        System.out.println(result2);



    }


    public static int addition (int a, int b){


        return a+b;  // methods only returns you -->/ buraya ne yazarsak onu return yapacak
          // return statement exits the methods. bundan sonra birsey yazilmaz
    }


}
