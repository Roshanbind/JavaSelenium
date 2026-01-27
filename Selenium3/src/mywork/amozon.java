package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amozon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		//		Continueshopping.click();
		WebElement	serchBox=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
		serchBox.sendKeys("Mobiles");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();

		List<WebElement>barnds=driver.findElements(By.xpath("//span[text()='Brands']/ancestor::div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox']"));
		int	size=barnds.size();
		System.out.println(size);

		for(int i=0;i<size;i++) {
			WebElement	weget=barnds.get(i);
			String text=weget.getText();
			System.out.println(text);
		}



	}

}
