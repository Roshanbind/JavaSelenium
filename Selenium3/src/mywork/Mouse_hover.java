package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		Actions actions = new Actions(driver);
		WebElement accountAndLists = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		actions.moveToElement(accountAndLists).build().perform();
		Thread.sleep(2000);
		WebElement yourOrders = driver.findElement(By.xpath("//div[@class='nav-right']//span[text()='& Orders']"));
		yourOrders.click();
		
	}

}
