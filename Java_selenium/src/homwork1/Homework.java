package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	//scenario-1
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		String url=("http://localhost:8181/");
		driver.get(url);

		By username=By.xpath("//input[@name='user_name']");
		WebElement weuserName=driver.findElement(username);
		Dimension size =weuserName.getSize();
		int hight =	size.height;
		int width  =	size.width;
		System.out.println(hight);
		System.out.println(width);
		//driver.findElement(By.xpath("//input[@name='user_name"));
		String	firstname=weuserName.getAttribute("type");
		System.out.println("first name ki value---"+firstname);
		weuserName.sendKeys("admin");
		Thread.sleep(3000);
		//weuserName.clear();
	
		By pass=By.xpath("//input[@name='user_password']");
		WebElement	password=driver.findElement(pass);
		String	byPassword=password.getAttribute("type");
		System.out.println("password ki value---"+byPassword);
		password.sendKeys("admin");
		Thread.sleep(3000);
		//		password.clear();
		//		String Pass=password.getAttribute("value");
		//		System.out.println("after clering fst password--"+Pass);

		By login=By.xpath("//input[@id='submitButton']");
		WebElement weLogin=driver.findElement(login);
		String Loginpage=weLogin.getAttribute("id");
		System.out.println("login page ki value---"+Loginpage);
		weLogin.click();




	}

}
