package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@class='a-button-text']")).click();
		driver.findElement(By.xpath("//div[@id='nav-global-location-slot']")).click();
		
		
	}

}
