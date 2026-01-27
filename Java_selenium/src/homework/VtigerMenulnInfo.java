package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerMenulnInfo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/multipleseiection.html");
		driver.manage().window().maximize();
		WebElement wemultiple=driver.findElement(By.xpath("//select[@name='cars']"));
		Select obj=new Select(wemultiple);
     	obj.selectByIndex(0);
     	String name=wemultiple.getAttribute("value");
     	System.out.println(name);
     	
		
		
		
	}

}
