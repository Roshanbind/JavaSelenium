package Inheritance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LeadTestt extends ParentClass {

	public static void main(String[] args) {
		ParentClass	Parent=new LeadTestt();
		Parent.Parent();
		
		//====STUDENT KA KAAM: LEAD MODULE===
		WebElement	leads=Parent.driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
		WebElement plusButton=Parent.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusButton.click();
		WebElement title=Parent.driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select	obj=new Select(title);
		obj.selectByIndex(1);
		WebElement firstName=Parent.driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Mohit");
		WebElement lastname=Parent.driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("kumar");
		WebElement companyName=Parent.driver.findElement(By.xpath("//input[@name='company']"));
		companyName.sendKeys("EVA");
		WebElement saveButton=Parent.driver.findElement(By.xpath("//input[@name='button']"));	
		saveButton.click();
			
		
	}
}
