package day15_ForLoop;

public class WarmUp_StringReverse {
    public static void main(String[] args) {

        /*3. write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        //chatAt ile
        String str="Java";
               //   0123
        String reverse1=""+str.charAt(3)+str.charAt(2)+ str.charAt(1)+ str.charAt(0);
        System.out.println(reverse1);


        //substring ile
        String reverse2= str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse2);


        //loop ile
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);


    }

}
