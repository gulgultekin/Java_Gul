package day47_Abstraction;

public abstract class RemoteWebDriver {

    String browserName;

    protected abstract void get(String URL);

    public abstract void quit();

}
