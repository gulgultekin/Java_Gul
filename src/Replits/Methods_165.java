package Replits;

public class Methods_165 {
    /*
    There are a few ways to get this galacticly popular drink, if its available at the store you can buy it.
or you can get it as a gift.
third option is to mix its ingredients (its a secret formula):
1 from  ingredient1 ,2 from ingredient2 and 3 from ingredient3.
or the alternate recipe:  3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.
this aint coca cola...

You need to have exact amount of ingredients for making the drink. not less or more

getThunderBlazz(boolean avilable,boolean gift, int ingredient1
  , int ingredient2, int ingredient3)

available  = available at store
gift = got it as a gift
both are booleans.

then theres the three ingredients as ints

example use:

getThunderBlazz(true,false,1,2,3)
returns true

getThunderBlazz(false,false,1,2,3)
returns true

getThunderBlazz(false,false,1,5,3)
returns false

getThunderBlazz(false,false,3,1,2)
returns true

getThunderBlazz(false,false,3,1,1)
returns false

getThunderBlazz(false,true,9,7,3)
returns true


hint: use parenthesis to separate logical arguments:

(true|| false && true)||(false&&TRUE) etc

or put them in their own variables, everything to make it easy to read.

     */
    public static void main(String[] args) {

        System.out.println(getThunderBlazz(false,true,1,1,2));

    }


    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3)
    {
        boolean result ;

         if(available!=true && gift!=true) {
             if (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) {
                 result = true;
             } else if (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
                 result = true;
             } else {
                 result = false;
             }


         }else if(available == true || gift== true){
             result=true;
         }
         else{
             result = false;
         }
         return result;

    }
}
