package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_NewLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		Passwor.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		WebElement	Leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leads.click();
		WebElement	plusebutton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusebutton.click();
		WebElement firstnameTitle=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		firstnameTitle.sendKeys("Mr.");
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Mohit");
		WebElement	lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Bind");
		WebElement companyName=driver.findElement(By.xpath("//input[@name='company']"));
		companyName.sendKeys("Oracle");
		WebElement	TitleName=driver.findElement(By.xpath("//input[@name='company']"));
		TitleName.sendKeys("Software");
		WebElement Lead_Source=driver.findElement(By.xpath("//select[@name='leadsource']"));
		Select Lead_Source2=new Select(Lead_Source);
		Lead_Source2.selectByVisibleText("Employee");
		WebElement Industry=driver.findElement(By.xpath("//select[@name='industry']"));
		Select Industry2=new Select(Industry);
		Industry2.selectByVisibleText("Education");
		WebElement Annual_Revenue=driver.findElement(By.xpath("//input[@name='annualrevenue']"));
		Annual_Revenue.sendKeys("3");
		WebElement Employees=driver.findElement(By.xpath("//input[@id='noofemployees']"));
		Employees.sendKeys("13");
		WebElement Secondary_Email	=driver.findElement(By.xpath("//input[@id='secondaryemail']"));
		Secondary_Email.sendKeys("mohitkumar123@gmail.come");
		WebElement	Phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys("7846727367");
		WebElement Mobile=driver.findElement(By.xpath("//input[@class='detailedViewTextBox']"));
		Mobile.sendKeys("oppo");
		WebElement Fax=driver.findElement(By.xpath("//input[@id='fax']"));
		Fax.sendKeys("mohit kumar");
		WebElement	Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Mohit123@gmail.com");
		WebElement Website=driver.findElement(By.xpath(""));
		Website.sendKeys("Vtiger.com");










	}

}
