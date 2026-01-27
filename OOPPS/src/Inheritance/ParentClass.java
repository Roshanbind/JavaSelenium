package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {
	ChromeDriver driver;
	public void Parent() {

		driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		
		
		WebElement	userName=driver.findElement(By.xpath("//input[@name='user_name']"));
		userName.sendKeys("admin");
		WebElement	password=driver.findElement(By.xpath("//input[@name='user_password']"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();

	}




}
