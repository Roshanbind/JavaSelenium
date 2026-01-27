package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		WebElement Language_dropdown =driver.findElement(By.xpath("//div[@class='nav-right']//button[@aria-label='Expand to Change Language or Country']"));
		Language_dropdown.click();
		Thread.sleep(2000);
		List<WebElement>Language=driver.findElements(By.xpath("//div[@id='nav-flyout-icp']//span[@class='nav-text']"));
		WebElement	weget=Language.get(2);
		String	text=weget.getText();
		System.out.println(text);
		weget.click();
		 if(weget.isDisplayed()) {
	            System.out.println("Page language changed to Hindi successfully!");
	        } else {
	            System.out.println("Language change failed.");
	        }
	}

}
