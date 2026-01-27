package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFilterTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement	serchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchBox.sendKeys("laptop");
		Thread.sleep(2000);
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		List<WebElement>Brand	=driver.findElements(By.xpath("//span[text()='HP']/parent::a"));
		WebElement get=Brand.get(0);
		String text=get.getText();
		System.out.println(text);
		if(get.isDisplayed()) {
            System.out.println(" hp Filters applied successfully!");
        } else {
            System.out.println(" hp Filter application failed.");
        }
		get.click();
		Thread.sleep(2000);
		WebElement	Rating_filter=driver.findElement(By.xpath("//a[@aria-label='Apply the filter 4 Stars & Up to narrow results']"));
		String	textt=Rating_filter.getText();
		System.out.println(textt);
		if(Rating_filter.isDisplayed()) {
            System.out.println(" Customer Reviews Filters applied successfully!");
        } else {
            System.out.println("Customer Reviews  Filter application failed.");
        }
		Rating_filter.click();
	}

}
