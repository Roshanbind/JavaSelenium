package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parent2 {

	ChromeDriver driver;
	public void  common() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		driver.manage().window().maximize();
		WebElement	userName=driver.findElement(By.xpath("//input[@name='user_name']"));
		userName.sendKeys("admin");
		WebElement	password=driver.findElement(By.xpath("//input[@name='user_password']"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		Thread.sleep(3000);
	}
		public void logout() {
		WebElement	Administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions	act=new Actions(driver);
		act.moveToElement(Administrator).build().perform();
		WebElement logout	=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		logout.click();
	}
}
