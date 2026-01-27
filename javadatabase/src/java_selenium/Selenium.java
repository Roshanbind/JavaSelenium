package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		   driver.get("http://localhost:8181/");
		    WebElement weusername=driver.findElement(By.name("user_name"));
		     weusername.click();
		      weusername.sendKeys("admin");
		      WebElement Password=driver.findElement(By.name("user_password"));
		     Password.click();
		    Password.sendKeys("admin");
		   WebElement submit=driver.findElement(By.id("submitButton"));
		  submit.click();	
	    }
     }
