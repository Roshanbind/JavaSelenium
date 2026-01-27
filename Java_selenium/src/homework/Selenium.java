package homework ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		By byUser=By.name("email");
		WebElement username=driver.findElement(byUser);
		username.sendKeys("7905299417");

		By pass=By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']");
		WebElement password=driver.findElement(pass);
		password.sendKeys("roshanbind");
		
		By Login=By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");
		WebElement Loginpage=driver.findElement(Login);
		 Loginpage.click();
		 
	}
}
