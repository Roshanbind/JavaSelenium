package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionality {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();

		WebElement	serchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchBox.sendKeys("laptop");
		Thread.sleep(2000);
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		WebElement	First_product=driver.findElement(By.xpath("//span[text()='laptop 16-inch , 8GB DDR 256GB SSD portable laptop computer, expandable to 1TB, Pentium quad-core CPU up to 2.64 GHz, 9000mAh battery, interface, USB3.0 interface, dual-band WiFi, webcam, slim laptops']"));
		String	text=First_product.getText();
		System.out.println(text);
		if(text.toLowerCase().contains("laptop")) {
		    System.out.println("product title contains laptop===pass");
		} else {
		    System.out.println("product title does not contain laptop===failed");
		}
	}

}
