package day47_Abstraction;


public  class  FirefoxDrriver extends RemoteWebDriver {

    @Override
    public void get(String URL){

        System.out.println("Opening "+URL+" in firefox browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Firefox browser");

    }
}
