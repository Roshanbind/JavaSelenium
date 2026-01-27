package Create_Xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
//			WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
//					Continueshopping.click();
		WebElement	serchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchbox.sendKeys("Headphones");
		WebElement clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();

		List<WebElement>Headphones =driver.findElements(By.xpath("//div[@class='a-row a-size-small']//a[@class='a-popover-trigger a-declarative mvt-review-star-mini-popover']"));
		int	wesize=Headphones.size();
		System.out.println(wesize);
		for(int i=0;i<wesize;i++) {
			WebElement	weget=Headphones.get(i);
			String	text=weget.getText();
			System.out.println(text);
		}

		//		List<WebElement>Shoes =driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		//		int	wesize=Shoes.size();
		//		System.out.println(wesize);
		//		for(int i=0;i<wesize;i++) {
		//			WebElement	weget=Shoes.get(i);
		//
		//			String	textt=weget.getText();
		//
		//			System.out.println(i+" "+textt);
		//		}




	}

}
