package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginpage_Filter {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		String url="http://localhost:8181/";
		driver.get(url);

		By userName=By.xpath("//input[@name='user_name']");
		WebElement textBox=driver.findElement(userName);
		textBox.sendKeys("admin");

		By pass=By.xpath("//input[@name='user_password']");
		WebElement password=driver.findElement(pass);
		password.sendKeys("admin");

		By login=By.xpath("//input[@id='submitButton']");	
		WebElement submitButton=driver.findElement(login);
		submitButton.click();

		WebElement Leadss=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leadss.click();
//		
//		WebElement more=driver.findElement(By.xpath("(//a[@href='javascript:;'] )[1]"));
//		Actions showmore=new Actions(driver);
//		showmore.moveToElement(more).build().perform();
	
		//Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='viewname']"));
		dropdown.click();
		if(dropdown.isDisplayed()) {
			System.out.println("dropdown is visible  for interaction-----passed");

		}else {
			System.out.println(" dropdown is  enabled for interaction------failed");

		}
		if(dropdown.isEnabled()) {
			System.out.println(" dropdown is  enabled for interaction-----passed");

		}else {
			System.out.println(" dropdown is visible and enabled for interaction-----failed");
		}
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='viewname']"));
		Select dropdown2=new Select(dropdown1);
		dropdown2.selectByIndex(1);
		WebElement dropdown3=dropdown2.getFirstSelectedOption();
		String  actualText1 =dropdown3.getText();
		System.out.println(actualText1);
		
		WebElement signout=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//Actions sign=new Actions(driver);
		//sign.moveToElement(signout).perform();
		signout.click();
		

	     	WebElement signout1=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		
				if(signout1.isDisplayed()) {
			System.out.println("signout is visible  for interaction-----passed");

		}else {
			System.out.println(" signout is  enabled for interaction------failed");

		}
		if(signout1.isEnabled()) {
			System.out.println(" signout is  enabled for interaction-----passed");

		}else {
			System.out.println(" signout is visible and enabled for interaction-----failed");
		}
		signout1.click();

		//driver.close();
		

	}

}
