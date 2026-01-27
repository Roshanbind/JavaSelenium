package Create_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_Vtiger {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement	Clospopop=driver.findElement(By.xpath("//section[@class='modalMain tcnFooter']//span[@class='commonModal__close']"));
		Clospopop.click();
		WebElement	search=driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();




	}

}
