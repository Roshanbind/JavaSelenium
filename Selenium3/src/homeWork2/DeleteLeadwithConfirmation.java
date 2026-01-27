package homeWork2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadwithConfirmation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement	username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		WebElement	usepassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		usepassword.sendKeys("admin");
		WebElement	loginButton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
		WebElement firstleadSel=driver.findElement(By.xpath("//input[@id='134']"));
		firstleadSel.click();
		WebElement del=driver.findElement(By.xpath("(//a[text()='del'])[2]"));
		del.click();
		Alert alert=driver.switchTo().alert();
		String	text=alert.getText();
		System.out.println(text);
		//alert.accept();
		
	}

}
