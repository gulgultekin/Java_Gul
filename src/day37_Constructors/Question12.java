package day37_Constructors;

public class Question12 {


        static String name = "Aaron";

        public static void main(String[] args) {
            System.out.println("Daniel");  // Daniel
        }

        public static void print(String str){
            System.out.println(str);
        }

        static{  // executed first
            print(name);  // Aaron
        }



    }




    class Test1{
        //int Inum = 10; // 2, each object has its own copy of isntances
         int Inum = 10; // there is only one copy of static that's shared by all objects
        // 20
        public static void main(String[] args) {
            Test1 obj1 = new Test1();
            obj1.Inum = 20;

            Test1 obj2 = new Test1();

            System.out.println(obj2.Inum); // 20

        }
}
