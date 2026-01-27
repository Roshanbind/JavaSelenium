package homeWork2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigationTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement mobilesTab=driver.findElement(By.xpath("//div[@class='nav-div']//a[text()='Mobiles']"));
		mobilesTab.click();
		String mobilesTitle=driver.getTitle();
		System.out.println("mobile title----"+mobilesTitle);
		String ActulTitle="Mobiles";
		if(mobilesTitle.equalsIgnoreCase(ActulTitle)) {
			System.out.println("Mobiles page verified");
		}else {
			System.out.println("Mobiles page not verified");
		}
		driver.navigate().back();
		List<WebElement> alltab=driver.findElements(By.xpath("//div[@class='nav-sprite']//div[@class='nav-div']"));
		WebElement todaysDeals=alltab.get(5);
		String dealsText = todaysDeals.getText();
		System.out.println("Today's Deals Text: " + dealsText);
		todaysDeals.click();
		driver.quit();
	}

}
