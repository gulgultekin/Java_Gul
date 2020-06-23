package day47_Abstraction;

public class DriverObject {

    public static void main(String[] args) {

        String URL = "https://www.google.com";

        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        //driver.get("https://www.google.com"); // yukardaki ile ayni sonuc

        driver.quit();

        System.out.println("************FIREFOX****************");

        FirefoxDrriver driver2 = new FirefoxDrriver();
        driver2.get(URL);
        driver2.quit();

        System.out.println("*************OPERA********************");

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.google.com");
        driver3.quit();

        System.out.println("**********EDGE**********************");

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("https://www.google.com");
        driver4.quit();

        System.out.println("************SAFARI********************");

        SafariDriver driver5 =new SafariDriver();
        driver5.get("https://google.com");
        driver5.quit();

        System.out.println("**********INTERNET EXPLORER************");

        IEDriver driver6 = new IEDriver();
        driver6.get("https://www.google.com");
        driver6.quit();

    }
}
