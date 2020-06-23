package day46_Final_Abstract.WarmUp_3_Browsers;

public class BrowsersObject {

    public static void main(String[] args) {

        ChromeBrowser obj1 = new ChromeBrowser("Chrome");
        obj1.get("https://www.google.com");
        obj1.close();
        obj1.maximize();

        FireFoxBrowser obj2 = new FireFoxBrowser("Firefox");
        obj2.get("https://www.google.com");

        OperaBrowser obj3 = new OperaBrowser("Opera");
        obj3.get("https://www.google.com");

    }
}
