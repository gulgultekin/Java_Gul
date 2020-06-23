package day47_Abstraction;

public class IEDriver extends RemoteWebDriver {


    @Override
    protected void get(String URL) {
        System.out.println("Opening "+URL+" in Internet explorer");
    }

    @Override
    public void quit() {
        System.out.println("closing the Internet Explorer");
    }
}
