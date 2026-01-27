package interfacee;

public class ChromBrowser implements BrowserDriver {

	@Override
    public void openBrowser() {
        System.out.println("Chrom Browser opened:");
    }
	
	@Override
    public void closeBrowser() {
        System.out.println("close chrom Browser");
    }
	
	@Override
    public void get(String url) {
        System.out.println("get string value is--" + url);
    }

	@Override
    public String getTitle() {
        System.out.println("get title of page");
        return "Sample Title";
    }
}
