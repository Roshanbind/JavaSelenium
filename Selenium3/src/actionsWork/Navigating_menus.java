package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Navigating_menus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		Passwor.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		//WebElement More=driver.findElement(By.xpath("(//a[@href='javascript:;']) [1]"));
		Actions	Act=new Actions(driver);
		//Act.click(More).build().perform();
		WebElement	dropdown=driver.findElement(By.xpath("(//select[@class='small'])[1]"));
		Act.click(dropdown).build().perform();
		Select obj2=new Select(dropdown);
		obj2.selectByIndex(4);
		//obj2.selectByVisibleText("New Campaigns");
		
		
	}

}
