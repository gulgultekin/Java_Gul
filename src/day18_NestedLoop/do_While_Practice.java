package day18_NestedLoop;

public class do_While_Practice {
    public static void main(String[] args) {
        /*
        print all the even number 0~100 in the same line seperated by a space
         */

        int num = 0;
        do {
            if (num % 2 == 0) {

                System.out.print(num + " ");
            }
                num++;
            } while (num <= 100) ;

        System.out.println();
        System.out.println("**********************************");
        //print all the odd number 0~100 in the same line seperated by a space

        int num2 =0;

        do{
            if (num2 % 2 != 0) {

                System.out.print(num2 + " ");
            }
            num2++;
        } while (num2 <= 100) ;


        System.out.println();
        System.out.println("**************************");
        int i= 1;
        do{
            i++;// 2 3 4 5 6 cunku once arttiriyor sonra print yapiyor
            System.out.println(i);
            //i++; //  1 2 3 4 5
        }while(i<=5);


        System.out.println("=========================");

        int z =1;
        do{
            System.out.println(z);
            if(z==3){
                break; // 3 ten sonra looptan cikiyor
            }
            z++;
        }while(z<=5);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        int y =1;
        do{
            if(y==3){
               y++;// bunu koymazsak printi ve iteratoru  skip yapiyor.ve hep 3 olarak kaliyor.
                // infinite time 3 olarak hep skip yapiyor it is running but skipping ve sadce 1 2 print yapip cikiyor
                //need to make sure that the iterator is not skipping, so that the condition will eventually be false
                continue;
            }
            System.out.println(y);

            y++;
        }while(y<=5);


        System.out.println("***********************************");

        int t= 1;
        do{
            if(t%2!=0){
                t++; // bunu koymayinca 1 de takili kaliyor.butun adimlari skip yapiyor (loop icinde old icin)
                // ve 1<100 old icin infinite tam run yapiyor
                continue;
            }
            System.out.print(t+" ");

            t++;
        }while(t<=100);

        }



        }


