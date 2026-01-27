package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Work1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		Passwor.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		WebElement	Leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leads.click();
		WebElement SerchBox=driver.findElement(By.xpath("//input[@class='searchBox']"));
		Actions	obj3=new Actions(driver);
		obj3.sendKeys(SerchBox,"Test Lead").build().perform();
		WebElement	Serch=driver.findElement(By.xpath("//input[@class='searchBtn']"));
		obj3.click(Serch).build().perform();

		Thread.sleep(3000);

		WebElement	dropdown=driver.findElement(By.xpath("//select[@name='search_field']"));
		Select obj=new Select(dropdown);
		obj.selectByVisibleText("Last Name");
		//obj.deselectByIndex(1);
		String	CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);


	}

}
