import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//a[@target='_blank']//h2
		Thread.sleep(2000);
		WebElement	serchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchbox.sendKeys("mobile");
		WebElement clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();

		List<WebElement>search_product=driver.findElements(By.xpath("//a[@target='_blank']//h2"));
		int	wesize=search_product.size();
		System.out.println(wesize);
		for(int i=0;i<wesize;i++) {
			WebElement	weget=search_product.get(i);
			String	text=weget.getText();
			System.out.println(i+" "+text);

		}
		System.out.println("total search product====="+wesize);

	}

}
