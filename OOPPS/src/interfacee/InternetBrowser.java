package interfacee;

public class InternetBrowser implements BrowserDriver {

	@Override
    public void openBrowser() {
        System.out.println("Internet Browser opened:");
    }
	
	@Override
    public void closeBrowser() {
        System.out.println("close Internet Browser");
    }
	
	@Override
    public void get(String url) {
        System.out.println("Internet Browser get string value is--" + url);
    }

	@Override
    public String getTitle() {
        System.out.println("Internet Browser get title of page");
        return "Sample Title";
    }
}
