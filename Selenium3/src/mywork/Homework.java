package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Homework {

	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		Actions	Act=new Actions(driver);
		driver.get("http://localhost:8181/");
		WebElement username=driver.findElement(By.xpath("//input[contains(@name,'user_name')]"));
		username.sendKeys("admin");
		String	tag=username.getTagName();
		System.out.println(tag);
		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'user_password')]"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[contains(@id,'submitButton')]"));
		login.click();
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
		List<WebElement>textboxes =driver.findElements(By.xpath("//input[@type='text']"));
		int	size=textboxes.size();
		System.out.println(size);

	//	WebElement	pluseButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	//	pluseButton.click();
//		WebElement	savebutton=driver.findElement(By.xpath("//input[@name='button'][1]"));
//		savebutton.click();
//		System.out.println("Last Name cannot be empty");
		List<WebElement>columns =driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
	
		int	size1=columns.size();
		System.out.println(size1);
		for(int i=0;i<size;i++) {
			WebElement weget=columns.get(i);
			weget.click();
		String	text=weget.getText();
		System.out.println(text);
		}
		

	}
}
