package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Field_Properties {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");
		String	Attributevalue=UserName.getAttribute("value");
		System.out.println(Attributevalue);
		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		Passwor.sendKeys("admin");
		String Attribute_value=Passwor.getAttribute("value");
		System.out.println(Attribute_value);
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		String tagName=login.getTagName();
		System.out.println("login button tag name----"+tagName);


	}

}
