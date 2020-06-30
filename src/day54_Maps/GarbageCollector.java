package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector(); // will not be collected by garbage collector
                            new GarbageCollector(); //will be collected by garbage collector

        System.out.println("Done");

        //unreference an object:

        String str = new String("Cybertek"); //unreferenced object
              str = new String("MIT");

        System.out.println(str);// MIT

        Integer num = new Integer(123);  //unreferenced object
                num = new Integer(124);

        System.out.println(num); // 124
                //123 will be collected by garbage collector

        Double n = new Double(0.5);
               n = null;//empty object

        System.out.println(n);//null

        System.out.println("************FINALIZE****************");


        GarbageCollector obj3 = new GarbageCollector();
       // obj3.finalize();//it is done implicitly



    }
}
