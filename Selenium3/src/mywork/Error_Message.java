package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_Message {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("");
		WebElement Passwor=driver.findElement(By.xpath("//input[@name='user_password']"));
		Passwor.sendKeys("");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		String expacted="";
		String acutal_text=login.getText();
		System.out.println(acutal_text);
		if(acutal_text.equalsIgnoreCase(expacted)) {
			System.out.println("Capture and verify error message");
			
		}else {
			System.out.println("Capture and verify not error message ");
		}
		
		
		

	}

}
