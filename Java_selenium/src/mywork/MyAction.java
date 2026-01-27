package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyAction {
	public WebDriver driver=null;

	public	MyAction(String driver){

		System.out.println(driver);
	}
	public	MyAction(WebDriver driver){
		this.driver=driver;
		System.out.println(driver);

	}
	public static void main(String[] args) {
 	    ChromeDriver driver=new ChromeDriver();
 		
		
		




	}

}
