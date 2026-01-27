package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Messologin_page {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement Serchbox=driver.findElement(By.xpath(""));
		Serchbox.sendKeys("Full Shrot");

	}

}
