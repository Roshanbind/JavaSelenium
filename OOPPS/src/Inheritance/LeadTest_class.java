package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LeadTest_class extends Parent2 {
	
	public void createLead() {	
	WebElement	lead=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
	lead.click();
	WebElement plusButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	plusButton.click();
	WebElement title=driver.findElement(By.xpath("//select[@name='salutationtype']"));
	Select	obj=new Select(title);
	obj.selectByIndex(1);
	WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstName.sendKeys("kishan");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("kumar");
	WebElement companyName=driver.findElement(By.xpath("//input[@name='company']"));
	companyName.sendKeys("EVA");
	WebElement saveButton=driver.findElement(By.xpath("//input[@name='button']"));	
	saveButton.click();
		}

	}


