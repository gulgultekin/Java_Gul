package day46_Final_Abstract.WarmUp_3_Browsers;

public class FireFoxBrowser extends Browsers{

    public FireFoxBrowser(String browserName){
        this.browserName =browserName;
    }

    public void get(String URL){
        System.out.println(browserName+" is openning "+URL);
    }

    public void close(){
        System.out.println(browserName+" is closing");
    }

    public void maximize(){
        System.out.println(browserName+" is maximizing");
    }
}
