package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

		WebElement	serchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchbox.sendKeys("mob");
		Thread.sleep(2000);
		List<WebElement>suggestions =driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		int	wesize=suggestions .size();
		System.out.println(wesize);
		for(int i=0;i<wesize;i++) {
			WebElement	weget=suggestions .get(i);
			String	suggestions_text=weget.getText();
			System.out.println(i+" "+suggestions_text);

		}
		System.out.println("total suggestions ====="+wesize);

	}


}
