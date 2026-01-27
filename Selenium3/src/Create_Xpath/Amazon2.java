package Create_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		WebElement	SearchBox=driver.findElement(By.xpath("//div[@class='nav-fill']//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("mobile");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@value='Go']"));
		clickButton.click();
	
		WebElement	iPhone=driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black'] /ancestor::div[@class='a-row'] //span[text()='47,999']"));
		iPhone.click();
		
	}

}
