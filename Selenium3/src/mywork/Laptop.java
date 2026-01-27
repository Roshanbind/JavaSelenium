package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement	serchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchbox.sendKeys("laptop");
		WebElement clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		
		
		List<WebElement>Laptop_price =driver.findElements(By.xpath("//span[@class='a-price']"));
		int	wesize=Laptop_price .size();
		System.out.println(wesize);
		for(int i=0;i<wesize;i++) {
			WebElement	weget=Laptop_price .get(i);
			String	laptopprice=weget.getText();
			System.out.println(i+" "+laptopprice);

		}
		System.out.println("total laptop price====="+wesize);

		
		List<WebElement>Links  =driver.findElements(By.xpath("//a"));
		int	wesizee=Links  .size();
		System.out.println("total home page links====="+wesizee);

	}

}
