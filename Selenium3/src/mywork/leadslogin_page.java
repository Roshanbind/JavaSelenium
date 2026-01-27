package mywork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leadslogin_page {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement username=driver.findElement(By.xpath("//input[contains(@name,'user_name')]"));
		username.sendKeys("admin");
		String	tag=username.getTagName();
		//System.out.println(tag);
		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'user_password')]"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[contains(@id,'submitButton')]"));
		login.click();
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
				
		
		List<WebElement>abc=driver.findElements(By.xpath("//td[@class='searchAlph']"));

		int	siz=abc.size();
		System.out.println(siz);	
		for(int i1=0;i1<siz;i1++) {
			WebElement	weeget=abc.get(i1);
			weeget.click();
			String	name=weeget.getText();
			//System.out.println(name);
			
		}
		Thread.sleep(30000);
		List<WebElement>clickbutton=driver.findElements(By.xpath("//input[@name='selected_id']"));
		int	size=clickbutton.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			WebElement weget=clickbutton.get(i);
			weget.click();
			{
		
		
			}
			}

	}}


