package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        // print alphabet backword and skip printing  Y, H, J, D

        for(char ch ='Z'; ch>='A'; ch--){

            if(ch=='Y'|| ch=='H' || ch=='J' || ch=='D'){
                continue;
            }

            System.out.print(ch+" ");
        }

        System.out.println();

        // skip the number divisible by 3 or  5

        for(int i= 1; i<=100; i++){

            if(i % 3 == 0 || i % 5 == 0){
                continue;
            }
            System.out.print(i+" ");
        }



    }
}
