package homeWork2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement	serchBox=driver.findElement(By.xpath("//div[@class='nav-fill']//div[@class='nav-search-field ']//input[@id='twotabsearchtextbox']"));
		serchBox.sendKeys("tshirt");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		Thread.sleep(2000);
		WebElement	GreatRepublicDay=driver.findElement(By.xpath("//div[@id='nav-swmslot']"));
		GreatRepublicDay.click();
		Thread.sleep(2000);
		List<WebElement>Gender	=driver.findElements(By.xpath("//div[@id='gender']//li[@class='a-spacing-micro']"));
		for(int i=0;i<Gender.size();i++) {
			WebElement option = Gender.get(i);
			System.out.println(option.getText());
		}


	}

}
