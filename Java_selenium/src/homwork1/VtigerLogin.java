package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		String url="http://localhost:8181/";
		driver.get(url);

		By userName=By.xpath("//input[@name='user_name']");
		WebElement textBox=driver.findElement(userName);
		textBox.sendKeys("admin");
		Thread.sleep(3000);

		By pass=By.xpath("//input[@name='user_password']");
		WebElement password=driver.findElement(pass);

		password.sendKeys("admin");
		Thread.sleep(3000);

		By login=By.xpath("//input[@id='submitButton']");	
		WebElement submitButton=driver.findElement(login);
		submitButton.click();
		Thread.sleep(3000);
		
		WebElement Leadss=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Leadss.click();
		String expactedTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		String actual_title_leads=driver.getTitle();
		System.out.println("Leads page title----"+actual_title_leads);
		if(actual_title_leads.equalsIgnoreCase(expactedTitle)) {
			System.out.println("title of Leads page is correct------passed");
		}else {
			System.out.println("title of Leads page is not correct------failed");
		}
		
		WebElement LeadNo=driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
		if(LeadNo.isDisplayed()) {
			System.out.println("Dropdown should be visible -----------passed");
		}else {
			System.out.println("Dropdown should be  not visible ---------failed");
		}
		if(LeadNo.isEnabled()) {
			System.out.println("Dropdown should be  enabled---------------passed");
		}else {
			System.out.println("Dropdown should be not enabled---------------failed");
		}
	
		WebElement searchBox =driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
		
		Select obj =new Select(searchBox);
		 
		WebElement weleads=obj.getFirstSelectedOption();
		String expacted_selecstion="Lead No";
	   String actualselection=weleads.getText();
	   System.out.println(actualselection);
	   if(actualselection.equalsIgnoreCase(expacted_selecstion)) {
		   System.out.println("Default option should  be empty --------passed");
		   
	   }else {
		   System.out.println("Default option should not be empty---------failed");
	   }
	   obj.selectByIndex(3);
	  
	  
	  
	  
	  
	  
	   
	   
	   
	   
	   
	   
	   
	   







































































































































		//		By Leads=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		//		WebElement leads=driver.findElement(Leads);
		//		leads.click();
		//		Thread.sleep(3000);

		//		By pluse=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif' ]");
		//		WebElement pluseButton=driver.findElement(pluse);
		//		pluseButton.click();
		//		Thread.sleep(3000);
		//		









		//		By title=By.xpath("//select[@name='salutationtype']");
		//		WebElement titleName=driver.findElement(title);
		//		titleName.sendKeys("Mr.");
		//		Thread.sleep(3000);
		//
		//		By firstName=By.xpath("//input[@name='firstname']");
		//		WebElement firstname=driver.findElement(firstName);
		//		firstname.sendKeys("Mohit kumar");
		//		Thread.sleep(3000);
		//
		//		By bylastname=By.xpath("//input[@name='lastname']");
		//		WebElement Lastname=driver.findElement(bylastname);
		//		Lastname.sendKeys("Bind");
		//		Thread.sleep(3000);
		//
		//		By Company=By.xpath("//input[@name='company']");
		//		WebElement CompanyName=driver.findElement(Company);
		//		CompanyName.sendKeys("Oracle");
		//		Thread.sleep(3000);
		//
		//		By TitleName=By.xpath("//input[@id='designation']");
		//		WebElement Title=driver.findElement(TitleName);
		//		Title.sendKeys("Software");
		//
		//		By source=By.xpath("//select[@name='leadsource']");
		//		WebElement Leadsourch=driver.findElement(source);
		//		Leadsourch.sendKeys("Employee");
		//		Thread.sleep(3000);
		//
		//		By Industry=By.xpath("//select[@name='industry']");
		//		WebElement Industryname=driver.findElement(Industry);
		//		Industryname.sendKeys("Engineering");
		//		Thread.sleep(3000);
		//
		//		By annualRevenue=By.xpath("//input[@name='annualrevenue']");
		//		WebElement Annualrevenue=driver.findElement(annualRevenue);
		//		Annualrevenue.sendKeys("3");
		//		Thread.sleep(3000);
		//
		//		By EmployeesNo=By.xpath("//input[@id='noofemployees']");
		//		WebElement NumberOfemployees=driver.findElement(EmployeesNo);
		//		NumberOfemployees.sendKeys("20");
		//		Thread.sleep(3000);
		//
		//		By Email=By.xpath("//input[@id='secondaryemail']");
		//		WebElement SecondaryEmail=driver.findElement(Email);
		//		SecondaryEmail.sendKeys("mohit123@gmail.com");
		//		Thread.sleep(3000);
		//
		//		By LeadNo=By.xpath("//input[@class='detailedViewTextBox']");
		//		WebElement LeadNumber=driver.findElement(LeadNo);
		//		LeadNumber.sendKeys("");
		//		Thread.sleep(3000);
		//
		//		By Phone=By.xpath("//input[@id='phone']");
		//		WebElement PhoneNuber=driver.findElement(Phone);
		//		PhoneNuber.sendKeys("91-7905299417");
		//		Thread.sleep(3000);
		//
		//		By Mobile=By.xpath("//input[@id='mobile']");
		//		WebElement MobileNumber=driver.findElement(Mobile);
		//		MobileNumber.sendKeys("7905299417");
		//		Thread.sleep(3000);
		//
		//		By Fax=By.xpath("//input[@id='fax']");
		//		WebElement FaxName=driver.findElement(Fax);
		//		FaxName.sendKeys("Mohit kumar");
		//		Thread.sleep(3000);
		//
		//		By emailId=By.xpath("//input[@id='email']");
		//		WebElement EmailId=driver.findElement(emailId);
		//		EmailId.sendKeys("Mohit123@gmail.com");
		//		Thread.sleep(3000);
		//
		//		By Website=By.xpath("//input[@name=\"website\"]");
		//		WebElement WebsiteName=driver.findElement(Website);
		//		WebsiteName.sendKeys("www.vtiger.com");
		//		Thread.sleep(3000);
		//
		//		By LeadStatus=By.xpath("//select[@name='leadstatus']");
		//		WebElement leadStatus=driver.findElement(LeadStatus);
		//		leadStatus.sendKeys("contact in future");
		//		Thread.sleep(3000);
		//
		//		By Rat=By.xpath("//select[@name='rating']");
		//		WebElement Rating=driver.findElement(Rat);
		//		Rating.sendKeys("active");
		//		Thread.sleep(3000);
		//
		//		By Assigned =By.xpath("//input[@name='assigntype']");
		//		WebElement AssignedTo=driver.findElement(Assigned);
		//		AssignedTo.sendKeys("Group");
		//		Thread.sleep(3000);
		//
		//		By Street=By.xpath("//textarea[@name='lane']");
		//		WebElement street=driver.findElement(Street);
		//		street.sendKeys("near by primary school");
		//		street.sendKeys(" bhagwati daspur bhadohi");
		//		
		//		By PostalCode=By.xpath("//input[@id='code']");
		//		WebElement postalCode=driver.findElement(PostalCode);
		//		postalCode.sendKeys("221402");
		//		Thread.sleep(3000);
		//
		//		By country=By.xpath("//input[@id='country']");
		//		WebElement CountryName=driver.findElement(country);
		//		CountryName.sendKeys("indian");
		//		Thread.sleep(3000);
		//
		//		By POBox=By.xpath("//input[@id='pobox']");
		//		WebElement PostBox=driver.findElement(POBox);
		//		PostBox.sendKeys("mohit kumar");
		//		PostBox.sendKeys(" Bhadohi");
		//		PostBox.sendKeys(" 221402");
		//		PostBox.sendKeys(" Uttar pradesh");
		//		Thread.sleep(3000);
		//
		//		By City=By.xpath("//input[@id='city']");
		//		WebElement CityName=driver.findElement(City);
		//		CityName.sendKeys("Bhadohi");
		//		Thread.sleep(3000);
		//
		//		By State=By.xpath("//input[@id='state']");
		//		WebElement StateNmae=driver.findElement(State);
		//		StateNmae.sendKeys("Uttar pradesh");
		//		Thread.sleep(3000);
		//
		//		By DescriptionFil=By.xpath("//textarea[@name='description']");
		//		WebElement Description=driver.findElement(DescriptionFil);
		//		Description.sendKeys("This is good Employee.");
		//		Thread.sleep(3000);
		//
		//		By save=By.xpath("//input[@name='button']");
		//		WebElement clickSaveButton=driver.findElement(save);
		//clickSaveButton.click();
	}

}
