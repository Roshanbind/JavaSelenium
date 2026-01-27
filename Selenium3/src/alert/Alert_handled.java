package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_handled {
	//Scenario=1
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions	option=new ChromeOptions();
		option.addArguments("--start-maximized");

		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.manage().window().maximize();
	
		WebElement CustomerID=driver.findElement(By.xpath("//input[@name='cusid']"));
		CustomerID.sendKeys("12345");
		WebElement  submitButton=driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String	 first_alert_text =alert.getText();
		System.out.println( first_alert_text );
		alert.accept();
		//Thread.sleep(2000);
		String	 second_alert_text = alert.getText();
		System.out.println(second_alert_text);
		alert.accept();
		
	}

}
