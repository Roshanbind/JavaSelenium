package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

//		public static void main(String[] args) {
//			ChromeDriver driver	=new ChromeDriver();
//			String url=("http://localhost:8181/");
//		driver.get(url);
//
//			By userName=By.name("user_name");
//			WebElement	UserName=driver.findElement(userName);
//		String weusername=UserName.getAttribute("name");
//		System.out.println("Attribute---"+weusername);
//			UserName.sendKeys("admin");
//	
//			By pass=By.name("user_password");
//			WebElement	password=driver.findElement(pass);
//			String	wepassword=password.getAttribute("name");
//			System.out.println("Attribute---"+wepassword);
//			password.sendKeys("admin");
//			//driver.close();
//	
//			By login=By.id("submitButton");
//			WebElement	byLogin	=driver.findElement(login);
//			String	weLogin	=byLogin.getAttribute("id");
//			System.out.println("Attribute--"+weLogin);
//		byLogin.click();
//		}

	
	public static void main(String[] args) {
		ChromeDriver driver	=new ChromeDriver();
		String url=("http://localhost:8181/");
		driver.get(url);

		By userName=By.xpath("//input[@name='user_name']");
		WebElement	UserName=driver.findElement(userName);
		String weusername=UserName.getAttribute("type");
		System.out.println("UserName---"+weusername);
		UserName.sendKeys("admin");

		By pass=By.xpath("//input[@name='user_password']");
		WebElement	password=driver.findElement(pass);
		String	wepassword=password.getAttribute("type");
		System.out.println("Userpassword---"+wepassword);
		password.sendKeys("admin");
		//driver.close();

		By login=By.xpath("//input[@id='submitButton']");
		WebElement	byLogin	=driver.findElement(login);
		String	weLogin=byLogin.getAttribute("id");
		System.out.println("Login--"+weLogin);
		byLogin.click();

//		By bysale=By.xpath("//a[@href='index.php?module=Leads&action=index']");
//		WebElement Leads=driver.findElement(bysale);
//		String weleads	=Leads.getAttribute("href");
//		System.out.println("Attribute----"+weleads);
//		Leads.click();

		By home=By.className("hdrLink");
		WebElement wehome=driver.findElement(home);
		String homepage =wehome.getAttribute("class");
		System.out.println("Home text------"+homepage);
		wehome.click();

//		By byhome=By.xpath("//a[@href='index.php?action=index&module=Home']");
//		WebElement home1=driver.findElement(byhome);
//		String hometext=home1.getAttribute("href");
//		System.out.println("Attribute---"+hometext);
//		home1.click();
		
		By vtiger=By.xpath("//img[@src='test/logo/vtiger-crm-logo.gif']");
		WebElement vtigerlogo=driver.findElement(vtiger);
		String vtiger1=vtigerlogo.getAttribute("src");
		System.out.println("vtiger Attribute---"+vtiger1);
		
		
		
	}
}
