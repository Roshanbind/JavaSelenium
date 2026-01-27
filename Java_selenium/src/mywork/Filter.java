package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Filter {

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
		WebElement weleads=obj.getFirstSelectedOption();
		String expacted_selecstion="All";
		String actualselection=weleads.getText();
		System.out.println(actualselection);
		WebElement filter_dropdown=driver.findElement(By.xpath("//select[@name='viewname']"));
		Select Filter=new Select(filter_dropdown);
		Filter.selectByIndex(2);
		WebElement FilterText=Filter.getFirstSelectedOption();
		String  actualText =FilterText.getText();
		System.out.println(actualText);

		/*
		 * Test Case 2: Filter “Hot Leads
			Steps:
			Vtiger में log in करें।
			Leads module जाएँ।
			Filter dropdown से “Hot Leads” चुनें।
		 *
		 */
		WebElement filter_dropdown1=driver.findElement(By.xpath("//select[@name='viewname']"));
		Select Filter1=new Select(filter_dropdown1);
		Filter1.selectByIndex(1);
		WebElement FilterText1=Filter.getFirstSelectedOption();
		String  actualText1 =FilterText1.getText();
		System.out.println(actualText1);






	}

}
