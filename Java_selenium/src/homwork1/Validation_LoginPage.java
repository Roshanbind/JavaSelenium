package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_LoginPage {

	public static void main(String[] args) {
		//Open the browser and launch Vtiger CRM login page

		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://localhost:8181/");

		//Get and print the current URL, page title
		String	Title=driver.getTitle();
		System.out.println("The Current URL Page Title------"+  Title);

		//in the username field, clear any existing text, type "admin", and then fetch the entered value using getAttribute("value").
		By user=By.xpath("//input[@name='user_name']");
		WebElement UserName=driver.findElement(user);
		UserName.sendKeys("mohit");
		UserName.getAttribute("user_name");
		String wrongAttribite=UserName.getAttribute("value");
		System.out.println("Attribute ki value is------"+  wrongAttribite);
		UserName.clear();
		String	wrongAttribite1=UserName.getAttribute("value");
		System.out.println("Attribute ki UserName may value------"+ wrongAttribite1);
		UserName.sendKeys("admin");
	    String	Attribute=UserName.getAttribute("value");
	    System.out.println("Attribute ki value UserName------"+Attribute);


		By pass=By.xpath("//input[@name='user_password']");
		WebElement	Password=driver.findElement(pass);
		Password.sendKeys("admin");

		By login=By.xpath("//input[@id='submitButton']");
		WebElement	Login=driver.findElement(login);
		Login.click();
		


	}

}
