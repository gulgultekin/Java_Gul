package Tasks;

public class Calisma11_String_indexOf {
    public static void main(String[] args) {
        String str= "today is tuesday, today we have class in the afternoon";
        int num= str.indexOf("ter");//47 baska t ler old icin t'den sonraki diger characterleri yazarsak dogru t yi bulur
        System.out.println(num);

        String Address= "7925 Jones Branch Dr, McLean, VA 22003";
        int begin= Address.indexOf(",")+2;// ","--boyle virgulu ","+1sonraki boslugu
                            // ","+2 yazincada virgul ve bosluktan sonraki city naminin ilk harfini buluyor
        int end =Address.indexOf(", V");
        String cityName= Address.substring(begin,end);
        System.out.println(cityName);

        String email="Random.Email@gmail.com";
        int begin2= email.indexOf("@")+1;
        int end2= email.indexOf(".com");
        String emailType=email.substring(begin2,end2 );
        System.out.println(emailType);

    }
}
