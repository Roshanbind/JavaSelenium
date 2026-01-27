package Create_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		WebElement search_box=driver.findElement(By.xpath("//div[@class='nav-fill']//input[@id='twotabsearchtextbox']"));
		search_box.sendKeys("Shoes");
		WebElement	suarch_button=driver.findElement(By.xpath("//input[@value='Go']"));
		suarch_button.click();
		WebElement	firstproductname=driver.findElement(By.xpath("//div[@class='a-row']/ancestor::div[@class='a-row']//span[@class='a-price']"));
		firstproductname.click();
	}

}
