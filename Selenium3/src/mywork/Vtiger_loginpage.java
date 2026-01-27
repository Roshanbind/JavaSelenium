package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Vtiger_loginpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement	UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		WebElement Password=driver.findElement(By.xpath("//input[@name='user_password']"));
		Password.sendKeys("admin");
		WebElement login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();	
		WebElement	SerchBox=driver.findElement(By.xpath("//input[@name='query_string']"));
		WebElement	clickButton=driver.findElement(By.xpath("//input[@class='searchBtn']"));
		SerchBox.sendKeys("Calendar");
		clickButton.click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='global_search_module']"));
		dropdown.click();
		Select	obj=new Select(dropdown);
		//obj.selectByVisibleText("Leads");
		//obj.selectByIndex(4);
		//obj.selectByContainsVisibleText("Leads");
		obj.selectByValue("Documents");
		Point location=dropdown.getLocation();
		location.getX();
		location.getY();
		System.out.println(location);
		Dimension size=dropdown.getSize();
		size.getHeight();
		size.getWidth();
		System.out.println(size);
		String	text=dropdown.getText();
		System.out.println(text);
		String	Tagname=dropdown.getTagName();
		System.out.println(Tagname);
		String	selectBox=dropdown.getAttribute("value");
		System.out.println(selectBox);
		String	url=driver.getCurrentUrl();
		System.err.println(url);
		String	page=driver.getPageSource();
		System.out.println(page);
		String	title=driver.getTitle();
		System.out.println(title);
		Navigation	navigat=driver.navigate();
		//navigat.back();
		//navigat.forward();
		navigat.refresh();
		WebElement	Leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Actions	obj3=new Actions(driver);
		obj3.click(Leads).build().perform();
		WebElement pluseButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		obj3.doubleClick(pluseButton).build().perform();
		WebElement hold=driver.findElement(By.xpath("//input[@name='firstname']"));
		obj3.sendKeys(hold, "Mohit").build().perform();
		obj3.click(hold).build().perform();
		WebElement	more=driver.findElement(By.xpath("(//a[@href['javascript:;']]) [1]"));
		more.click();




	}

}
