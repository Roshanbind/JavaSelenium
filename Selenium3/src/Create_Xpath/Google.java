package Create_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement	serchbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		serchbox.sendKeys("Selenium");
		WebElement	serchButton=driver.findElement(By.xpath("//span[@class='Ty0Rrc z1asCe MZy1Rb']"));
		serchButton.click();
		Thread.sleep(2000);
		List<WebElement>seggesion=driver.findElements(By.xpath("//div[@class='lnnVSe']"));
		WebElement as =seggesion.get(3);
		String text=as.getText();
		System.out.println(text);
		as.click();

		

	}

}
