package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		driver.manage().window().maximize();

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin");

		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		Thread.sleep(2000);

		/////////////////   DragDRop   /////////////
		WebElement weSource=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [1]"));
		WebElement weTarget=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [6]"));
		Actions obj1=new Actions(driver);
		obj1.dragAndDrop(weSource, weTarget).build().perform();
		Thread.sleep(2000);

//		WebElement Leadss=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
//		Leadss.click();
//
//		WebElement weMore=driver.findElement(By.xpath("(//a[@href='javascript:;']) [1]"));
//		obj1.moveToElement(weMore).build().perform(); 
//		Thread.sleep(2000);
//		
//		WebElement Administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		obj1.moveToElement(Administrator).build().perform();
//		Thread.sleep(2000);
//
//		WebElement help=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
//		obj1.moveToElement(help).build().perform();
//		Thread.sleep(2000);
//
//		/////// Right click /////
//		WebElement rightClick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//		obj1.contextClick(rightClick).build().perform();
//		Thread.sleep(2000); 
//
//		////// double click /////
//		WebElement doubleclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//		obj1.doubleClick(doubleclick).build().perform();
//		Thread.sleep(2000); 
	}

}
