package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrgTestt extends Parent2{

	public void createOrganization() throws InterruptedException {
	
		WebElement	Organization=driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		Organization.click();
		Thread.sleep(2000);
		WebElement Organization_plusButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Organization_plusButton.click();
		WebElement Organization_name	=driver.findElement(By.xpath("//input[@name='accountname']"));
		Organization_name.sendKeys("ramu");
		WebElement	Industry=driver.findElement(By.xpath("//select[@name='industry']"));
		Select obj=new Select(Industry);
		obj.selectByIndex(8);
		WebElement	SaveButton=driver.findElement(By.xpath("//input[@name='button']"));
		SaveButton.click();
		
	}	
}
