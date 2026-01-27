package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		String url=("http://localhost:8181/");
		driver.get(url);

		By username=By.xpath("//input[@name='user_name']");
		WebElement weuserName =driver.findElement(username);
		String	value=weuserName.getAttribute("name");
		weuserName.sendKeys("adminse");
		System.out.println("Attribute name ki value----"+value);
		Thread.sleep(3000);
		weuserName.clear();
		weuserName.sendKeys("admin");
		
		//Seneario-1
		
		
		

	}

}
