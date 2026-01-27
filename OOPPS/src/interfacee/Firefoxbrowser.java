package interfacee;

public class Firefoxbrowser implements BrowserDriver {
	
	@Override
    public void openBrowser() {
        System.out.println("Firefox browser opened:");
    }
	
	@Override
    public void closeBrowser() {
        System.out.println("close Firefox browser");
    }
	
	@Override
    public void get(String url) {
        System.out.println("get string value is Firefox browser" + url);
    }

	@Override
    public String getTitle() {
        System.out.println(" Firefox browser get title of page");
        return "Sample Title";
    }
	
	
}
