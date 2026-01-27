package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactTes extends Parent2 {
	public void createContac() throws InterruptedException {
		Thread.sleep(2000);
		WebElement	Contacts=driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
		Contacts.click();
		WebElement plusButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusButton.click();
		WebElement title=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select	obj=new Select(title);
		obj.selectByIndex(1);
		WebElement firstName=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		firstName.sendKeys("Mohit");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("kumar");
		WebElement	Mobile_number=driver.findElement(By.xpath("//input[@id='mobile']"));
		Mobile_number.sendKeys("5766384748");
		WebElement	SaveButton=driver.findElement(By.xpath("//input[@name='button']"));
		SaveButton.click();
			
	}
}
