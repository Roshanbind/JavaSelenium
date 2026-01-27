package Create_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3sSchool {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(we);
		WebElement	webe=driver.findElement(By.xpath("//button[@type='button']"));
		webe.click();
		driver.switchTo().defaultContent();

	}

}
