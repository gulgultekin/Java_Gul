package Tasks;

public class Calisma13_Loop_removingDuplicates {
    public static void main(String[] args) {

        String str="aabbcc";
        String result="";

        for(int i=0; i<str.length(); i++){

            if(!result.contains(str.substring(i,i+1))){

                result= result+(str.substring(i,i+1));
            }
        }
        System.out.println(result);



        String str2= "aaabbccddffegghh";
        String result2="";

        for(int i=0; i<str2.length();i++){
            if(!result2.contains(str2.substring(i,i+1))){
                result2+=str2.substring(i,i+1);
            }
        }
        System.out.println(result2);


        String s= "asdghgdfhgsdfhgsdhfghsdg";
        String sonuc="";

        for(int i=0; i<s.length(); i++){

            if(!sonuc.contains(s.substring(i,i+1))){
                sonuc+=s.substring(i,i+1);
            }
        }
        System.out.println(sonuc);


        String a="hghsdgfhsgafhgsdh";
        String sonuc3="";

        for(int i=0; i<a.length();i++){
            if(!sonuc3.contains(""+a.charAt(i))){
                sonuc3+=(""+a.charAt(i));
            }
}
        System.out.println(sonuc3);

    }
}
