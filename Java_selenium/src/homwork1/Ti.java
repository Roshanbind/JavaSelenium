package homwork1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ti {

	public static void main(String[] args) {
		
ChromeDriver dr=new	ChromeDriver();
dr.get("http://localhost:8181/");
WebElement name =dr.findElement(By.xpath("//input[@name='user_name']"));
name.sendKeys("admin");
String rd=name.getAttribute("value");

System.out.println(rd);
WebElement pass =dr.findElement(By.xpath("//input[@name='user_password']"));
pass.sendKeys("admin");
String pass2=pass.getAttribute("value");

System.out.println(pass2);
WebElement login=dr.findElement(By.xpath("//input[@id='submitButton']"));
String Login=login.getAttribute("value");
System.out.println(Login);
login.click();

	}

}
