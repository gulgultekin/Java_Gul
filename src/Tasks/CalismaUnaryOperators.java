package Tasks;

public class CalismaUnaryOperators {
    public static void main(String[] args) {

        int x =2;
        int y =x++;
        // y = 2
        System.out.println(y);

        int x1 =2;
        System.out.println(x1++); //2

        int x3 = 2;
        System.out.println(--x3); // 1

        int x4 = 8;
        int y4 = x4 --;
        //  y4 = 8
        System.out.println(y4);

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
      //a = -1 + 0 /-1 *-1
        //a=-1 +   0   * -1
        // a = -1 +  0
        System.out.println(a); //-1


        int a1 = 50;
        a1 = --a1 + a1++ + a1-- + a1++;
      //a1 = 49 + 49 + 50 + 49 = 197
        System.out.println(a1);


        int a2 = 4;
        int b2 = a2 *4 - a2++;
        // b2 = 4 * 4 - 4
        System.out.println(b2);//12

    }
}
