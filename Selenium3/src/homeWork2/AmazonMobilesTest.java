package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilesTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement mobilesTab=driver.findElement(By.xpath("//div[@class='nav-div']//a[text()='Mobiles']"));
		mobilesTab.click();
		String pageTitle = driver.getTitle();
		System.out.println("Page Title---"+pageTitle);
		if (pageTitle.contains("Mobile")) {
			System.out.println("User navigated to Mobiles page---Passed");
		} else {
			System.out.println("Mobiles page not opened----Failed");
		}
		 driver.quit();

	}

}
