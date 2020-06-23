package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {


    @Override
    public void get(String URL) {
        System.out.println("Opening " +URL+ " in opera browser");
    }


    public void quit() {
        System.out.println("Closing the opera browser");
    }
}
