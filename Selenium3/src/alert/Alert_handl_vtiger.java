package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_handl_vtiger {

	//Scenario=2

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions	option=new ChromeOptions();
		option.addArguments("--start-maximized");

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		//driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");

		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userpassword.sendKeys("admin");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		loginbutton.click();

		WebElement Leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leads.click();

		WebElement pluseButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		pluseButton.click();

		WebElement Savebutton1=driver.findElement(By.xpath("//input[@name='button']"));
		Savebutton1.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String	text=alert.getText();
		System.out.println(text);
		alert.accept();
		

	}

}
