package Create_Xpath;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3s {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		Actions	Act=new Actions(driver);
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Act.scrollByAmount(0, 12200).build().perform();
		WebElement we=driver.findElement(By.xpath("//iframe[@title='How To Selection']"));
		driver.switchTo().frame(we);
		WebElement	webe=driver.findElement(By.xpath("//a[@class='next']"));
		webe.click();
		driver.switchTo().defaultContent();
		
		WebElement we2=driver.findElement(By.xpath("//iframe[@title='How To Selection']"));
		driver.switchTo().frame(we2);
		WebElement	webe2=driver.findElement(By.xpath("//a[@class='next']"));
		webe.click();
		driver.switchTo().defaultContent();
		
		
		
	}

}
