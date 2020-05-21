package Tasks;

public class Calisma_String_LastIndex {
    public static void main(String[] args) {
        String myEmail ="MyEmail.school@hotmail.com";
        int begin=myEmail.indexOf("@")+1;
        int end= myEmail.lastIndexOf(".");
        String emailType=myEmail.substring(begin,end);
        System.out.println(emailType);

    }
}
