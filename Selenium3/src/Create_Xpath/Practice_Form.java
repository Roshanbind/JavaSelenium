package Create_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Practice_Form {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Actions	act=new Actions(driver);
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement	firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Mohit");
		WebElement Lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		Lastname.sendKeys("Kumar");
		WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("Mohitkumar1234@gmail.com");

		WebElement	Gender=driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//div[@class='custom-control custom-radio custom-control-inline']"));
		Gender.click();

		WebElement	Number=driver.findElement(By.xpath("//input[@id='userNumber']"));
		Number.sendKeys("6307416099");
		//Thread.sleep(3000);
		
		act.scrollByAmount(0, 800).perform();
		Thread.sleep(2000);
		WebElement	Submit=driver.findElement(By.xpath("//button[@id='submit']"));
		act.click(Submit).perform();

	}

}
