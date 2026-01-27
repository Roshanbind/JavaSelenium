package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement	iframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement	heading_text=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		heading_text.click();
		
		String	heding_text=heading_text.getText();
		System.out.println(heding_text);
		driver.switchTo().defaultContent();	
	}

}
