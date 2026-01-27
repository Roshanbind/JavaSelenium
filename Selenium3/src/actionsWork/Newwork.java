package actionsWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newwork {

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

		List<WebElement>clickbutton=driver.findElements(By.xpath("//input[@name='selected_id']"));
		int	size=clickbutton.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			WebElement weget=clickbutton.get(i);
			weget.click();
		}

		List<WebElement>abc=driver.findElements(By.xpath("//td[@class='searchAlph']"));

		int	siz=abc.size();
		System.out.println(siz);	
		for(int i=0;i<siz;i++) {
			WebElement	weeget=abc.get(i);
			String	name=weeget.getText();
			//System.out.println(name);
			weeget.click();
		}

		WebElement	more=driver.findElement(By.xpath("//a[text()='More']"));
		Act.moveToElement(more).build().perform();
		List<WebElement> more1=driver.findElements(By.xpath("//td[@class='tabUnSelected']"));

		int size1=more1.size();
		System.out.println(size1);
		for(int i=0;i<size1;i++) {
			WebElement	wegat=more1.get(i);
			String	text=wegat.getText();
			System.out.println(text);
			
		}

		List<WebElement>  linkElement=driver.findElements(By.tagName("*"));
		System.out.println("Total link on wepage----"+linkElement.size());
		for(int i=0;i<linkElement.size();i++) {
			WebElement	get=linkElement.get(i);
			String text=get.getText();
			if(text==""){

			}else {
				System.out.println(text);
			}

		}







	}

}
