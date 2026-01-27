package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_3 {

	public static void main(String[] args) {

		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width  ");

		WebElement	iframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframe);
		WebElement	hading_text=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		hading_text.click();
		String	heding_text=hading_text.getText();
		System.out.println("heading text====="+heding_text);
		driver.switchTo().defaultContent();	
		WebElement parant =	driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(parant);
		WebElement iframeText =driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		String text2= iframeText.getText();
		System.out.println("heading text====="+text2);
	}

}
