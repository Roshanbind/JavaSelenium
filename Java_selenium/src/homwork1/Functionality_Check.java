package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionality_Check {

	public static void main(String[] args) {
		//Browser launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		//Window maximize;
		driver.manage().window().maximize();
		//Vtiger CRM login page open

		//Login using sendKeys()
		By user=By.xpath("//input[@name='user_name']");
		WebElement UserName=driver.findElement(user);
		UserName.sendKeys("admin");

		By pass=By.xpath("//input[@name='user_password']");
		WebElement	Password=driver.findElement(pass);
		Password.sendKeys("admin");

		By login=By.xpath("//input[@id='submitButton']");
		WebElement	Login=driver.findElement(login);
		Login.click();
		//Top search box में कोई value डालो (e.g. “Contact1”)

		By serchBox=By.xpath("//input[@name='query_string']");
		WebElement	SerchBox=driver.findElement(serchBox);
		SerchBox.sendKeys("e.g. “Contact1”");
		//getAttribute("value") से verify करो कि entered search text सही है
		SerchBox.getAttribute("query_string");
		String wrongAttribite=SerchBox.getAttribute("value");
		System.out.println("Attribute ki value is------"+  wrongAttribite);
		SerchBox.clear();
		
		//फिर clear() करो और नया keyword “Lead1” डालो
		String	wrongAttribite1=SerchBox.getAttribute("value");
		System.out.println("Attribute ki serchbox may value------"+ wrongAttribite1);
		SerchBox.sendKeys("keyword “Lead1”");
		String	Attribute=SerchBox.getAttribute("value");
		System.out.println("Attribute ki value serchbox------"+Attribute);

		//👉 Output: Console me pehle “Contact1” print hoga, फिर “Lead1” print होगा।

//		String PageSource=driver.getPageSource();
//		System.out.println(PageSource);
//		String title=driver.getTitle();
//		System.out.println(title);
//
//		String strobe=driver.getCurrentUrl();
//		System.out.println(strobe);





	}

}
