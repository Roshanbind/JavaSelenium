package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_LeadsFilter {

	private static final String Else = null;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String url="http://localhost:8181/";
		driver.get(url);

		By userName=By.xpath("//input[@name='user_name']");
		WebElement textBox=driver.findElement(userName);
		textBox.sendKeys("admin");

		By pass=By.xpath("//input[@name='user_password']");
		WebElement password=driver.findElement(pass);
		password.sendKeys("admin");

		By login=By.xpath("//input[@id='submitButton']");	
		WebElement submitButton=driver.findElement(login);
		submitButton.click();

		WebElement Leadss=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leadss.click();
		WebElement Apply_filter =driver.findElement(By.xpath("//select[@name='viewname']"));
		Apply_filter.click();
		Select obj =new Select(Apply_filter); 
		String Tagname=Apply_filter.getTagName();
		System.out.println(Tagname);
		String	text=Apply_filter.getText();
		System.out.println(text);
		obj.selectByVisibleText("This Month Leads");
		obj.selectByIndex(2);
		WebElement dropdown =driver.findElement(By.xpath("//select[@name='viewname']"));
		Select drop=new Select(dropdown);
		String Expecteddrop="All";
		drop.selectByValue("1");
		WebElement a =drop.getFirstSelectedOption();
		String actualdrop=a.getText();
		if(Expecteddrop.equals(actualdrop)) {
			System.out.println("Correct Option Selected");
			
		}else {
			System.out.println("Wrong Option");
		}
}
	}

