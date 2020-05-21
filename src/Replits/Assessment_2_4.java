package Replits;

public class Assessment_2_4 {
    /*
    Write a a method appearsTwice() that returns true if value of variable target appears
     only twice in the string sentence, otherwise return false.

    Examples:
       Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
       Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop  is too old.") - returns true,
        because laptop appears twice.
     */
    public static void main(String[] args) {

            System.out.println("Hello world!");
        boolean result=appearsTwice("java", "java java is  fun!");
        System.out.println(result);
        }

        /**
         * @param target - string that you need to check.
         * @param sentence - string where you need to lookup for target.
         * @return
         */

        public static boolean appearsTwice(String target, String sentence) {
            int count=0;

            boolean res=true;
            while(res){

                if(sentence.contains(target)){
                   sentence= sentence.replaceFirst(target,"");
                        count++;
                    }else{
                    res=false;
                }
                }
            if(count>=2){
                res=true;
            }
            else{
                res=false;
            }
           return res;
    }
}
//    int count =0;
//    boolean a= true;
//   while(a) {
//           if (sentence.contains(target)) {
//           sentence=sentence.replaceFirst(target,"");
//           count++;
//           } else {
//           a=false; }
//           }
//           return (count == 2)? true:false;
//           }