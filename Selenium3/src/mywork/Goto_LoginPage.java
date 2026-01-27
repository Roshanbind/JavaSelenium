package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goto_LoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("Admin");  
		System.out.println("wrong username in usernamebox------Admin");
		weUserName.clear();
		Thread.sleep(2000);
		weUserName.sendKeys("admin");
		System.out.println("correc  username in usernamebox------admin");
		
		Thread.sleep(2000);
		WebElement  wePasswor=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePasswor.sendKeys("Admin");
		System.out.println("wrong Passwor in Passworbox------Admin");
		
		wePasswor.clear();
		Thread.sleep(2000);
		wePasswor.sendKeys("admin");
		System.out.println(" correc  Passwor in Passworbox------admin");

		WebElement	welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		
		if(welogin.isDisplayed()==true) {
			System.out.println("Cleared and Logged in Successfully");
			
		}else {
			System.out.println(" Error in login");
		}
		welogin.click();
		
	}

}
