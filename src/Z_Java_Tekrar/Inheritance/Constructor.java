package Z_Java_Tekrar.Inheritance;

public class Constructor {

    static int i;
    int j;


    public static void main(String[] args) {

        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor();
        obj.i=1;
        obj.j=2;

        obj2.i=5;
        obj2.j=6;
        System.out.print(obj.i+" "+obj.j+" "+obj2.i+" "+obj2.j);
                        // 5           2         5          6
    }



}
