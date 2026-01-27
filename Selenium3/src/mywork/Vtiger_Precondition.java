package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_Precondition {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("Admin");
		weUserName.clear();
		weUserName.sendKeys("admin");

		WebElement  wePasswor=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePasswor.sendKeys("Admin");
		wePasswor.clear();
		wePasswor.sendKeys("admin");

		WebElement	Weloging=driver.findElement(By.xpath("//input[@id='submitButton']"));
		Weloging.click();

		String ExpactedTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String weActual=driver.getTitle();
		System.out.println(weActual);
		
		String	weActual1=driver.getCurrentUrl();
		System.out.println(weActual1);
		
		String Vtiger="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String Actual=driver.getTitle();
		if(Actual.equalsIgnoreCase(Vtiger)) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}





	}
}
