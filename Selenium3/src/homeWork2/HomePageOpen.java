package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageOpen {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement	username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		WebElement	usepassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		usepassword.sendKeys("admin");
		WebElement	loginButton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		loginButton.click();
		String	ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String Expected_title = "Administrator - Home - vtiger CRM";
		if(Expected_title.equalsIgnoreCase(ActualTitle)) {
			System.out.println("actual and expacted title is matched----title validation passed");
		}else {
			System.out.println("actual and expacted title is not matched----title validation Failed");
		}
		

	}

}
