package Tasks;

public class Calisma14_Array_Unique_String {
    public static void main(String[] args) {
        // find unique string value

        String[] arr1 = {"a","a", "b","b","c"};


        for(int j=0; j<arr1.length; j++) {
            int count1 = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals(arr1[j])) {
                    count1++;
                }
            }
            if(count1==1){
                System.out.println(arr1[j]);
            }

        }

    }
}
