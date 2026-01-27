package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadMandatoryFields {

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
		WebElement	pulsButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		pulsButton.click();
		WebElement	lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("bind");
		String	ActuallastName=lastname.getAttribute("value");
		System.out.println("Last name---"+ActuallastName);
		String ExpectedLastName="bind";
		if(ExpectedLastName.equalsIgnoreCase(ActuallastName)) {
			System.out.println("actual and expacted last name is matched---- validation passed");
		}else {
			System.out.println("actual and expacted last name not matched---- validation Failed");
		}
		WebElement	Company=driver.findElement(By.xpath("//input[@name='company']"));
		Company.sendKeys("eva");
		String	ActualCompany=Company.getAttribute("value");
		System.out.println("Company name---"+ActualCompany);
		String ExpectedCompany="eva";
		if(ExpectedCompany.equalsIgnoreCase(ActualCompany)) {
			System.out.println("actual and expacted Company name is matched---- validation passed");
		}else {
			System.out.println("actual and expacted Company name not matched---- validation Failed");
		}
		WebElement	saveButton=driver.findElement(By.xpath("//input[@name='button']"));
		//saveButton.click();









	}

}
