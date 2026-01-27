package actionsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Work {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		Actions	obj1=new Actions(driver);
		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		obj1.sendKeys(UserName, "admin").build().perform();
		//obj1.sendKeys("admin").build().perform();

		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		obj1.sendKeys(Passwor, "admin").build().perform();
		//obj1.sendKeys("admin").build().perform();
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		obj1.click(login).build().perform();
		//obj1.click(login).build().perform();
		String Expactedtitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actual_homePage_title=driver.getTitle();
		System.out.println("home page title----"+actual_homePage_title);
		if(actual_homePage_title.equals(Expactedtitle)) {
			System.out.println("Home page title is correct---");
			
		}else {
			System.out.println("Home page title is not correct--");
		}


	}

}
