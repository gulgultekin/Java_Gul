package day44_Exceptions;

public class Browsers {
    /*
    warmup task:
    1. create a class called Browsers
            actions: openBrowser():prints "opens the default browser"
                     closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
            actions: openBrowser(): opens the chrome browser
                     closeBrowser(): closes the chrome browser
    3. creata a class called FirefoxBrowser
            actions: openBrowser(): opens the Firefox browser
                     closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
            actions: openBrowser(): opens the Opera browser
                     closeBrowser(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions
     */

    public void openBrowser(){
        System.out.println("opens the default browser");
    }

    public void closeBrowser(){
        System.out.println("closes the default browser");
    }

}
class ChromeBrowser extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("opens the chrome browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("closes the chrome browser");
    }

}

class FirefoxBrowser extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("opens the Firefox browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("closes the Firefox browser");
    }

}

class OperaBrowser extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("opens the Opera browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("closes the Opera browser");
    }

}

class Test{
    public static void main(String[] args) {

        Browsers obj1 = new Browsers();
        obj1.openBrowser();
        obj1.closeBrowser();

        ChromeBrowser obj2 = new ChromeBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();

        FirefoxBrowser obj3 = new FirefoxBrowser();
        obj3.openBrowser();
        obj3.closeBrowser();

        OperaBrowser obj4 = new OperaBrowser();
        obj4.openBrowser();
        obj4.closeBrowser();

    }
}