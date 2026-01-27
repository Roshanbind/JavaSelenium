package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrgTest extends ParentClass {

	public static void main(String[] args) throws InterruptedException {
		ParentClass parent=new	OrgTest();
		parent.Parent();
		//=======Student ka kaam======

		WebElement	Organization=parent.driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		Organization.click();
		Thread.sleep(2000);
		WebElement Organization_plusButton=parent.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Organization_plusButton.click();
		WebElement Organization_name	=parent.driver.findElement(By.xpath("//input[@name='accountname']"));
		Organization_name.sendKeys("Rohit");
		WebElement	Industry=parent.driver.findElement(By.xpath("//select[@name='industry']"));
		Select obj=new Select(Industry);
		obj.selectByIndex(8);
		WebElement	SaveButton=parent.driver.findElement(By.xpath("//input[@name='button']"));
		SaveButton.click();


	}
}
