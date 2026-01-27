package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	
    ChromeDriver driver;

	public void Browserlaunch() {
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void URLopen(String url) {
		driver.get("http://localhost:8181/");
		
	}
	public void UserName(String username) {
	WebElement	userName=driver.findElement(By.xpath("//input[@name='user_name']"));
	userName.sendKeys("admin");
	
	}
	public void Password(String Password) {
	WebElement	password=driver.findElement(By.xpath("//input[@name='user_password']"));
	password.sendKeys("admin");
	
	}
	public void Loginbutton() {
	WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
	login.click();
	
	}
	
	
	

}
