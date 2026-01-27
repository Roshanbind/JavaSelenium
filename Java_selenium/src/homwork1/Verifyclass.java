package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyclass {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
//		driver.manage().window().maximize();
//		String Title=driver.getTitle();
//		System.out.println(Title);

		WebElement UserName= driver.findElement(By.xpath("//input[@name='user_name']"));
	
		UserName.sendKeys("Shivam");
		UserName.getAttribute("user_name");
		String WrongAttribute=UserName.getAttribute("value");
		System.out.println("Attribute Value Of Wrong UserName"+WrongAttribute);
		UserName.clear();
		String WrongAttribute1=UserName.getAttribute("value");
		System.out.println("Attribute Value Of Wrong UserName"+WrongAttribute1);
		UserName.sendKeys("admin");
		String Attribute=UserName.getAttribute("value");
		System.out.println("Attribute value of UserName--- "+Attribute);

		WebElement Userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		Userpassword.sendKeys("Mohit");
		String WrongAttribute2  =Userpassword.getAttribute("value");
		System.out.println("Attribute value of wrong Userpassword--"+WrongAttribute2);
		Userpassword.clear();
		String WrongAttribute3  =Userpassword.getAttribute("value");
		System.out.println("Attribute value of wrong Userpassword--"+WrongAttribute3);
		Userpassword.sendKeys("admin");
		String Attribute1 =Userpassword.getAttribute("value");
		System.out.println("Attribute value of Pasword--"+Attribute1);

		WebElement	Userlogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		Userlogin.click();

		WebElement Leads =driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leads.click();




	}

}

