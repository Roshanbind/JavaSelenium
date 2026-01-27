package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NonParmiterAction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement	UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		WebElement	userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userPassword.sendKeys("admin");
		WebElement login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		////mouse over ,hover
		Actions	Act=new Actions(driver);
		
		WebElement weDrag=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [1]"));
		WebElement	weDrop=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [17]"));
		Act.dragAndDrop(weDrag, weDrop).build().perform();
		
		WebElement scroll=driver.findElement(By.xpath("//div[@class='MatrixLayer twoColumnWidget']"));
		Act.scrollToElement(scroll).build().perform();
		Thread.sleep(3000);
		WebElement weMore=driver.findElement(By.xpath("//a[@href='javascript:;']"));
		Act.moveToElement(weMore).build().perform();
	
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Act.contextClick(leads).build().perform();
		Act.click().build().perform();

		WebElement pluseButton=driver.findElement(By.xpath("//img[@title='Create Lead...']"));
		Act.doubleClick(pluseButton).build().perform();

		WebElement SerchBox=driver.findElement(By.xpath("//input[@value='Search...']"));
		Act.sendKeys("rahul").build().perform();
		
		WebElement laedsBox=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Act.clickAndHold(laedsBox).build().perform();
		

	}

}
