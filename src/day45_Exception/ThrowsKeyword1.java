package day45_Exception;

public class ThrowsKeyword1 {

    public static void sleep1() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }
    //iki turlude handle olabilir

    public static void sleep2()throws InterruptedException {//tam olarak halletmiyor

        Thread.sleep(3000);//InterruptedException old icin throwun yanina yaziyoruz

    }


    public static void main(String[] args)throws InterruptedException {
        System.out.println("Cybertek");

        sleep2();//hata veriyor. bu yuzden yukariya(main methoda) throws InterruptedException ekliyoruz->duzeliyor
        System.out.println("Java");
    }

    public static void method1() throws Exception{
                    // caller
       String[]arr ={"A"};
       main(arr);
    }

    public static void method2(){
        try {
            method1();//hata veriyor methodun yanina throw exception yamamiz gerekiyor yada try catch ile handle edilmeli
        }catch (Exception e){

        }
    }

    public static void method3(){
        method2();//try catch ile halloldugu icin hata vermiyor
    }





}
