package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactTest extends ParentClass {

	public static void main(String[] args) throws InterruptedException {
		ParentClass	parent=new ContactTest();
		parent.Parent();
		//=====Student ka kaam====
		Thread.sleep(2000);
		WebElement	Contacts=parent.driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
		Contacts.click();
		WebElement plusButton=parent.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusButton.click();
		WebElement title=parent.driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select	obj=new Select(title);
		obj.selectByIndex(1);
		WebElement firstName=parent.driver.findElement(By.xpath("//select[@name='salutationtype']"));
		firstName.sendKeys("Mohit");
		WebElement lastname=parent.driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("kumar");
		WebElement	Mobile_number=parent.driver.findElement(By.xpath("//input[@id='mobile']"));
		Mobile_number.sendKeys("5766384748");
		WebElement	SaveButton=parent.driver.findElement(By.xpath("//input[@name='button']"));
		SaveButton.click();







	}

}
