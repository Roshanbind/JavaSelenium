package interfacee;

public class TestRunor {

	public static void main(String[] args) {
		BrowserDriver	driver=new ChromBrowser();
	
		driver.openBrowser();
		driver.closeBrowser();
		driver.get("mohan");
		driver.getTitle();
	System.out.println("---------------------------------");
		BrowserDriver	Driver=new Firefoxbrowser();	
		Driver.openBrowser();
		Driver.closeBrowser();
		Driver.get("ram");
		Driver.getTitle();
	System.out.println("----------------------------------");
		BrowserDriver	Driverr=new InternetBrowser();	
		Driverr.openBrowser();
		Driverr.closeBrowser();
		Driverr.get("name");
		Driverr.getTitle();
	}
	
}
