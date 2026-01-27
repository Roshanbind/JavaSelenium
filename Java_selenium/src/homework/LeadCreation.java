package homework;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadCreation {

	public static void main(String[] args) {
		// Lead Creation and Verification in Vtiger CRM

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		//Type the username admin in the username box.

		By user=By.xpath("//input[@name='user_name']");
		WebElement userName=driver.findElement(user);
		userName.sendKeys("admin");
		
		//-Check what value is stored inside the First Name box (it should show which you pass value).
		 String name =userName.getAttribute("value");
         System.out.println(name);
		//Type the password admin in the password box.

		By pass=By.xpath("//input[@name='user_password']");
		WebElement password=driver.findElement(pass);
		password.sendKeys("admin");
		//  Note down the height and width of the Last Name input box.

		Dimension dim=password.getSize();
		int hght=dim.height;
		int wdth=dim.width;
		System.out.println(hght);
		System.out.println(wdth);

		//Press the Login button.

		By login=By.xpath("//input[@id='submitButton']");
		WebElement Loginpage=driver.findElement(login);
		Loginpage.click();
		//From the home page, click on the Leads option.
		//Click on Add Lead to open the lead creation form.

		By leads=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement Leads=driver.findElement(leads);
		Leads.click();

		By pluse=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement	Pluse=driver.findElement(pluse);
		Pluse.click();

		By title=By.xpath("//select[@name='salutationtype']");
		WebElement titleName=driver.findElement(title);
		titleName.sendKeys("Mr.");

		//-In the First Name box, pass value.
		By firstName=By.xpath("//input[@name='firstname']");
		WebElement Namebox=driver.findElement(firstName);
		Namebox.sendKeys("Mohit kuamr");

		//In the Last Name box, pass value
		By lastName=By.xpath("//input[@name='lastname']");
		WebElement LastNameBox=driver.findElement(lastName);
		LastNameBox.sendKeys("Bind");

		//-In the Company box, first type ABC Pvt Ltd.
		By CompanyBox=By.xpath("//input[@name='company']");
		WebElement firstType=driver.findElement(CompanyBox);
		firstType.sendKeys("ABC Pvt Ltd");
		firstType.clear();

		// -Erase the company name and re-enter it as XYZ Pvt Ltd.
		firstType.sendKeys(" XYZ Pvt Ltd");

		







	}

}
