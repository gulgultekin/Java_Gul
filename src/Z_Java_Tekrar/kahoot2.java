package Z_Java_Tekrar;

public class kahoot2 {
    public static void main(String[] args) {

        int[]arr ={10,20,30,40,50};
        for(int i =0; i<arr.length;i++){

            System.out.println(arr[i]);
            if(arr[i]==10){
                return;
            }
        }
        System.out.println("Work done");
    }
}
