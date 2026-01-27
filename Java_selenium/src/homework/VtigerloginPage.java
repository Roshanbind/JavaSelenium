package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerloginPage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		By user=By.name("user_name");
		WebElement userName=driver.findElement(user);
		userName.sendKeys("admin");
		
		By pass=By.xpath("//input[@name='user_password']");
		WebElement password=driver.findElement(pass);
		password.sendKeys("admin");
		
		By Login=By.xpath("//input[@id='submitButton']");
		WebElement Loginpage=driver.findElement(Login);
		Loginpage.click();
		
		By Home=By.xpath("//td[@class='moduleName']");
		WebElement HomePage=driver.findElement(Home);
		HomePage.click();
		
		By Pluse=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement plusePage=driver.findElement(Pluse);
		plusePage.click();
		
		
		
		
		

	}

}
