package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {

        int a = 50;
        a = --a + a++ + a-- + a++;
        //  49 + 49  + 50 + 49 =197
        System.out.println(a);


        int x = 4;
        int y = x * 4 - x++;
        //    4*4= 16 - 4

        System.out.println(y);

        int b = 1;
       b = -b-- + b++ / -b-- * --b;

         // -1 + 0 / -1 *-1
        // -1 + 0 * -1
        // -1 + 0
        //-1

        System.out.println(b);


        int aa = 50;
        aa = --aa + aa++ + aa-- + aa++;
        // 49 + 49 + 50 + 49 ==197
        System.out.println(aa);

        int xx = 4;
        int yy = xx * 4 - xx++;
          //  4 * 4 - 4
        // 16-4 =12


        int bb = 1;
        bb = -bb-- + bb++ / -bb-- * --bb;

        // - 1 + 0 / -1 * -1
        // -1 + 0 * -1
        // -1 + 0
       // -1



            }

}
