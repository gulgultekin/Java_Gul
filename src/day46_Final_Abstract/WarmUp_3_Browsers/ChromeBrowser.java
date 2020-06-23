package day46_Final_Abstract.WarmUp_3_Browsers;

public class ChromeBrowser extends Browsers {
    /*
    Task03:
		1. create an abstract class called Browser
					attribues: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
		2. creata three sub classes of Browser:
								1. ChromeBrowser
								2. FireFoxBrowser
								3. OperaBrowser
						each class MUST have constructors to initialize the attributes
					each actions should ONLY be applicable to the object it's called from
					Ex:
						chrome.get("https://www.google.com")
						output should be: chrome browse is opening https://www.google.com
									(it should not open the URL in different browser other than chrome)
     */


    public ChromeBrowser(String browserName){
        this.browserName =browserName;
    }
    @Override
    public void get(String URL){
        System.out.println(browserName+" is openning "+URL);
    }
     @Override
    public void close(){
        System.out.println(browserName+" is closing");
    }
    @Override
    public void maximize(){
        System.out.println(browserName+" is maximizing");
    }
}
