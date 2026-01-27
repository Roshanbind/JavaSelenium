package mycode;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mywork {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.youtube.com/feed/downloads");
		Thread.sleep(3000);
		driver.get("http://localhost:8181/");	
	}
}
