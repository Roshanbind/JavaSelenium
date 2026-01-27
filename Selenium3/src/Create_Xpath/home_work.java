package Create_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class home_work {

	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement username=driver.findElement(By.xpath("//input[contains(@name,'user_name')]"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'user_password')]"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[contains(@id,'submitButton')]"));
		login.click();
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
		List<WebElement>welinkList=driver.findElements(By.xpath("//a"));
		int	linkscount=welinkList.size();
		int blankcount=0;
		int textcount=0;
		for(int i=0;i<linkscount;i++) {
			WebElement	weget=welinkList.get(i);
			String linkstext=weget.getText();
			if(linkstext.equalsIgnoreCase("")==true) {
				blankcount=blankcount+1;
			}else {
				System.out.println(i+1+"-"+linkstext);
				textcount=textcount+1;
			}

		}
		List<WebElement>clickbutton=driver.findElements(By.xpath("//input[@name='selected_id']"));
		int	size=clickbutton.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			WebElement weget=clickbutton.get(i);
			weget.click();
		}
		
		
		List<WebElement>images =driver.findElements(By.xpath("//img"));
		int	imgsize=images.size();
		System.out.println(imgsize);
		for(int i=0;i<size;i++) {
			WebElement weget=images .get(i);
			String	text=weget.getText();
			System.out.println(text);
		}

		System.out.println("total images===="+imgsize);
	
		List<WebElement>dropdown =driver.findElements(By.xpath("//div[@id='basicsearchcolumns_real']//select[@name='search_field']//option"));
		int	dropdownsize=dropdown.size();
		System.out.println(dropdownsize);
		for(int i=0;i<dropdownsize;i++) {
			WebElement weget=dropdown .get(i);
			String	text=weget.getText();
			System.out.println(text);
		}

		System.out.println("total dropdown===="+dropdownsize);
	
	}

}
