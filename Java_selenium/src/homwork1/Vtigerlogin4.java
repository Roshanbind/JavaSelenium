package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Vtigerlogin4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8181/");
		String	ExpectedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String ActualTitle=driver.getTitle();
		System.out.println("Login page Title------"+ActualTitle);
		if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
			System.out.println("actual and expacted title is matched----title validation true");
		}else {
			System.out.println("actual and expacted title is not matched----title validation fales");
		}
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		if(username.isDisplayed()) {
			System.out.println("inputbox username field is visible-----------passed");
		}else {
			System.out.println("inputbox username field is not visible---------failed");
		}
		if(username.isEnabled()) {
			System.out.println("inputbox username field is enable---------------passed");
		}else {
			System.out.println("inputbox username field is disable---------------failed");
		}
		String expactedinputfieldvalue="";
		String Actualinputfieldvalue=username.getAttribute("value");
		if(Actualinputfieldvalue.equalsIgnoreCase(expactedinputfieldvalue)==true) {
			System.out.println("input username field is blank before enter value-----passed");
		}else {
			System.out.println("input username field value is present before entering value-----failed");
		}
		username.sendKeys("admin");
		String expactedvalue="admin";
		String Actualtextval=username.getAttribute("value");
		if(Actualtextval.equalsIgnoreCase(expactedvalue)==true) {
			System.out.println("expected text value is show-----passed");
		}else {
			System.out.println("expected text value is not show-----failed");
		}
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		if(userpassword.isDisplayed()==true) {
			System.out.println("inputbox userpassword field is visible-----------passed");
		}else {
			System.out.println("inputbox userpassword field is not visible-----------failed");
		}
		if(userpassword.isEnabled()==true) {
			System.out.println("inputbox userpassword field is enable---------------passed");
		}else {
			System.out.println("inputbox userpassword field is disable---------------failed");
		}
		String Expactedinputfieldvalue="";
		String ActualInputfieldvalue=userpassword.getAttribute("value");
		if(ActualInputfieldvalue.equalsIgnoreCase(Expactedinputfieldvalue)==true) {
			System.out.println("input userpassword field is blank before enter value-----passed");
		}else {
			System.out.println("input userpassword field value is present before entering value-----failed");

		}
		WebElement password=driver.findElement(By.xpath("//input[@name='user_password']"));
		String expactedtypeAttribute="password";
		String actualAtribute=password.getAttribute("type");
		System.out.println(actualAtribute);
		if(actualAtribute.equalsIgnoreCase(expactedtypeAttribute)) {
			System.out.println("password masked-----passed");
		}else {
			System.out.println("password is not masked----failed");
		}
		userpassword.sendKeys("admin");
		String expactedValue="admin";
		String Actualvalue=userpassword.getAttribute("value");
		if(Actualvalue.equalsIgnoreCase(expactedValue)==true) {
			System.out.println("expected text value is show-----passed");
		}else {
			System.out.println("expected text value is not show-----failed");
		}
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		if(loginbutton.isDisplayed()) {
			System.out.println(" loginbutton field is visible-----------passed");
		}else {
			System.out.println(" loginbutton field is not visible-----------failed");
		}
		if(loginbutton.isEnabled()) {
			System.out.println("loginbutton field is enable---------------passed");
		}else {
			System.out.println("loginbutton field is disable---------------failed");
		}
		WebElement welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		welogin.click();

		WebElement more=driver.findElement(By.xpath("(//a[@href='javascript:;'] )[1]"));
		Actions showmore=new Actions(driver);
		showmore.moveToElement(more).build().perform();

		Thread.sleep(2000);
		WebElement help=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
		Actions help1=new Actions(driver);
		help1.moveToElement(help).build().perform();
		Thread.sleep(2000);

		WebElement Administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions singOut=new Actions(driver);
		singOut.moveToElement(Administrator).build().perform();
		Thread.sleep(2000);

		String expactedtitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actual_title_home=driver.getTitle();
		System.out.println("Home page Title----"+actual_title_home);
		if(actual_title_home.equalsIgnoreCase(expactedtitle)==true) {
			System.out.println("title of home page is correct------passed");
		}else {
			System.out.println("title of home page is not correct----failed");
		}
		WebElement Leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		if(Leads.isDisplayed()) {
			System.out.println("Leadsbutton field is visible-----------passed");
		}else {
			System.out.println("Leadsbutton field is not visible-----------failed");
		}
		if(Leads.isEnabled()) {
			System.out.println("leadsbutton field is enable---------------passed");
		}else {
			System.out.println("leadsbutton field is disable---------------failed");
		}
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
		WebElement leadsNo=driver.findElement(By.xpath("//select[@name='search_field']"));
		if(leadsNo.isDisplayed()) {
			System.out.println("leadsNofield is visible-----------passed");
		}else {
			System.out.println("leadsNo field is not visible-----------failed");
		}
		if(leadsNo.isEnabled()) {
			System.out.println("leadsNo field is enable---------------passed");
		}else {
			System.out.println("leadsNofield is disable---------------failed");
		}

		WebElement pluseButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		if(pluseButton.isDisplayed()) {
			System.out.println("plusebutton field is visible-----------passed");
		}else {
			System.out.println("plusebutton field is not visible-----------failed");
		}
		if(pluseButton.isEnabled()) {
			System.out.println("plusebutton field is enable---------------passed");
		}else {
			System.out.println("plusebutton field is disable---------------failed");
		}
		WebElement PluseButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		PluseButton.click();
		Thread.sleep(2000);
		////// double click /////
		WebElement doubleclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Actions doclick=new Actions(driver);
		doclick.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000); 
		/////// Right click /////
		WebElement rightClick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Actions click =new Actions(driver);
		click.contextClick(rightClick).build().perform();
		Thread.sleep(2000); 
	     /////////////////   DragDRop   /////////////
//		WebElement weSource=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [1]"));
//        WebElement weTarget=driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr']) [6]"));
//		Actions obj1=new Actions(driver);
//		obj1.dragAndDrop(weSource, weTarget).build().perform();
		
		String expactedCreating_New_Leadtitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		String actual_Creating_New_Lead_title=driver.getTitle();
		System.out.println("Creating New Leads title----- "+actual_Creating_New_Lead_title);
		if(actual_Creating_New_Lead_title.equalsIgnoreCase(expactedCreating_New_Leadtitle)) {
			System.out.println("title of Creating New Lead page is correct------passed");
		}else {
			System.out.println("title of Creating New Lead page is not correct------failed");
		}
		WebElement firstnameTitle=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		if(firstnameTitle.isDisplayed()==true) {
			System.out.println("inputbox firstnameTitle field is visible-----------passed");
		}else {
			System.out.println("inputbox firstnameTitle field is not visible-----------failed");
		}
		if(firstnameTitle.isEnabled()==true) {
			System.out.println("inputbox firstnameTitle field is enable---------------passed");
		}else {
			System.out.println("inputbox firstnameTitlefield is disable---------------failed");
		}
		WebElement we=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select selctobj=new Select(we);
		selctobj.selectByVisibleText("Mr.");
		System.out.println("first name title is Mr.");

		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		if(FirstName.isDisplayed()) {
			System.out.println("inputbox firstname field is visible-----------passed");
		}else {
			System.out.println("inputbox firstname field is not visible-----------failed");
		}
		if(FirstName.isEnabled()) {
			System.out.println("inputbox firstname field is enable---------------passed");
		}else {
			System.out.println("inputbox firstname field is disable---------------failed");
		}
		String expactedFirstname="";
		String actual_first_name=FirstName.getAttribute("value");
		if(actual_first_name.equalsIgnoreCase(expactedFirstname)) {
			System.out.println("input firstname field is blank before enter value-----passed");
		}else {
			System.out.println("input firstname field value is present before entering value-----failed");
		}
		FirstName.sendKeys("Mohit");
		String expactedValueFirstname="mohit";
		String Actual_value_First_Name=FirstName.getAttribute("value");
		if(Actual_value_First_Name.equalsIgnoreCase(expactedValueFirstname)==true) {
			System.out.println("expected first name text value is show-----passed");
		}else {
			System.out.println("expected first name text value is not show-----failed");
		}
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		if(Lastname.isDisplayed()) {
			System.out.println("inputbox lastname field is visible-----------passed");
		}else {
			System.out.println("inputbox lastname field is not visible-----------failed");
		}
		if(Lastname.isEnabled()) {
			System.out.println("inputbox lastname field is enable---------------passed");
		}else {
			System.out.println("inputbox lastname field is disable---------------failed");
		}
		String expactedLastname="";
		String actual_last_name=Lastname.getAttribute("value");
		if(actual_last_name.equalsIgnoreCase(expactedLastname)) {
			System.out.println("input lastname field is blank before enter value-----passed");
		}else {
			System.out.println("input lastname field value is present before entering value-----failed");
		}
		Lastname.sendKeys("Bind");
		String expacted_Last_name="bind";
		String ActualLast_name=Lastname.getAttribute("value");
		if(ActualLast_name.equalsIgnoreCase(expacted_Last_name)) {
			System.out.println("expected last name text value is show-----passed");
		}else {
			System.out.println("expected last name text value is not show-----failed");
		}
		WebElement CompanyName=driver.findElement(By.xpath("//input[@name='company']"));
		if(CompanyName.isDisplayed()) {
			System.out.println("inputbox company field is visible-----------passed");
		}else {
			System.out.println("inputbox company field is not visible-----------failed");
		}
		if(CompanyName.isEnabled()) {
			System.out.println("inputbox company field is anable---------------passed");
		}else {
			System.out.println("inputbox company field is disable---------------failed");
		}
		String expactedCompany="";
		String Actual_company=CompanyName.getAttribute("value");
		if(Actual_company.equalsIgnoreCase(expactedCompany)) {
			System.out.println("input company field is blank before enter value-----passed");
		}else {
			System.out.println("input company field value is present before entering value-----failed");
		}
		CompanyName.sendKeys("Oracle");
		String Expacted_company="Oracle";
		String actual_company=CompanyName.getAttribute("value");
		if(actual_company.equalsIgnoreCase(Expacted_company)) {
			System.out.println("expected company text value is show-----passed");
		}else {
			System.out.println("expected company text value is not show-----failed");
		}
		WebElement Title=driver.findElement(By.xpath("//input[@id='designation']"));
		if(Title.isDisplayed()) {
			System.out.println("inputbox title field is visible-----------passed");
		}else {
			System.out.println("inputbox title field is not visible-----------failed");
		}
		if(Title.isEnabled()) {
			System.out.println("inputbox title field is anable---------------passed");
		}else {
			System.out.println("inputbox title field is disable---------------failed");
		}
		String expacted_title="";
		String actual_title=Title.getAttribute("value");
		if(actual_title.equalsIgnoreCase(expacted_title)) {
			System.out.println("input title field is blank before enter value-----passed");
		}else {
			System.out.println("input lastname field value is present before entering value-----faile");
		}
		Title.sendKeys("Software");
		String expacted_Title="Software";
		String actula_attribute=Title.getAttribute("value");
		if(actula_attribute.equalsIgnoreCase(expacted_Title)) {
			System.out.println("expected title text value is show-----passed");
		}else {
			System.out.println("expected title text value is not show-----failed");
		}
		WebElement LeadSource=driver.findElement(By.xpath("//select[@name='leadsource']"));
		if(LeadSource.isDisplayed()==true) {
			System.out.println("inputbox LeadSource field is visible-----------passed");
		}else {
			System.out.println("inputbox LeadSource field is not visible-----------failed");
		}
		if(LeadSource.isEnabled()==true) {
			System.out.println("inputbox LeadSource field is enable---------------passed");
		}else {
			System.out.println("inputbox LeadSource field is disable---------------failed");
		}
		WebElement Lead_Source=driver.findElement(By.xpath("//select[@name='leadsource']"));
		Select Lead_Source2=new Select(Lead_Source);
		Lead_Source2.selectByVisibleText("Employee");
		System.out.println("Lead Source  is  Employee");

		WebElement Industry=driver.findElement(By.xpath("//select[@name='industry']"));
		if(Industry.isDisplayed()==true) {
			System.out.println("inputbox Industry field is visible-----------passed");
		}else {
			System.out.println("inputbox Industry field is not visible-----------failed");
		}
		if(Industry.isEnabled()==true) {
			System.out.println("inputbox Industry field is enable---------------passed");
		}else {
			System.out.println("inputbox Industry field is disable---------------failed");
		}
		WebElement Industry1=driver.findElement(By.xpath("//select[@name='industry']"));
		Select Industrty1=new Select(Industry1);
		Industrty1.selectByVisibleText("Education");
		System.out.println("Industry is  Education");

		WebElement Phone=driver.findElement(By.xpath("//input[@id='phone']"));
		if(Phone.isDisplayed()) {
			System.out.println("inputbox Phone field is visible-----------passed");
		}else {
			System.out.println("inputbox Phone field is not visible-----------failed");
		}
		if(Phone.isEnabled()) {
			System.out.println("inputbox Phone field is anable---------------passed");
		}else {
			System.out.println("inputbox Phone field is disable---------------failed");
		}
		String expacted_Phone="";
		String actual_Phone=Phone.getAttribute("value");
		if(actual_Phone.equalsIgnoreCase(expacted_Phone)) {
			System.out.println("input Phone field is blank before enter value-----passed");
		}else {
			System.out.println("input Phone field value is present before entering value-----faile");
		}
		Phone.sendKeys("91-8905299417");
		String expacted_Phone_vale="91-7905299417";
		String actula_attribute_Phone=Phone.getAttribute("value");
		if(actula_attribute_Phone.equalsIgnoreCase(expacted_Phone_vale)) {
			System.out.println("expected Phone text value is show-----passed");
		}else {
			System.out.println("expected Phone text value is not show-----failed");
		}
		WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		if(Mobile.isDisplayed()) {
			System.out.println("inputbox Mobile field is visible-----------passed");
		}else {
			System.out.println("inputboxMobile field is not visible-----------failed");
		}
		if(Mobile.isEnabled()) {
			System.out.println("inputbox Mobile field is anable---------------passed");
		}else {
			System.out.println("inputbox Mobile field is disable---------------failed");
		}
		String expacted_Mobile="";
		String actual_Mobile=Mobile.getAttribute("value");
		if(actual_Mobile.equalsIgnoreCase(expacted_Mobile)) {
			System.out.println("input Mobile field is blank before enter value-----passed");
		}else {
			System.out.println("input Mobile field value is present before entering value-----faile");
		}
		Mobile.sendKeys("oppo");
		String expacted_Mobile_vale="oppo";
		String actula_attribute_Mobile=Mobile.getAttribute("value");
		if(actula_attribute_Mobile.equalsIgnoreCase(expacted_Mobile_vale)) {
			System.out.println("expected Mobile text value is show-----passed");
		}else {
			System.out.println("expected Mobile text value is not show-----failed");
		}
		WebElement Fax=driver.findElement(By.xpath("//input[@id='fax']"));
		if(Fax.isDisplayed()) {
			System.out.println("inputbox Fax field is visible-----------passed");
		}else {
			System.out.println("inputbox Fax field is not visible-----------failed");
		}
		if(Fax.isEnabled()) {
			System.out.println("inputbox Fax field is anable---------------passed");
		}else {
			System.out.println("inputbox Faxfield is disable---------------failed");
		}
		String expacted_Fax="";
		String actual_Fax=Fax.getAttribute("value");
		if(actual_Fax.equalsIgnoreCase(expacted_Fax)) {
			System.out.println("input Fax field is blank before enter value-----passed");
		}else {
			System.out.println("inputFax field value is present before entering value-----faile");
		}
		Fax.sendKeys("Mohit kumar");
		String expacted_Fax_vale="Mohit kumar";
		String actula_attribute_Fax=Fax.getAttribute("value");
		if(actula_attribute_Fax.equalsIgnoreCase(expacted_Fax_vale)) {
			System.out.println("expected Fax text value is show-----passed");
		}else {
			System.out.println("expected Fax text value is not show-----failed");
		}
		WebElement Emai=driver.findElement(By.xpath("//input[@id='email']"));
		if(Emai.isDisplayed()) {
			System.out.println("inputbox Emai field is visible-----------passed");
		}else {
			System.out.println("inputbox Emai field is not visible-----------failed");
		}
		if(Emai.isEnabled()) {
			System.out.println("inputbox Emai field is anable---------------passed");
		}else {
			System.out.println("inputbox Emai field is disable---------------failed");
		}
		String expacted_Emai="";
		String actual_Emai=Emai.getAttribute("value");
		if(actual_Emai.equalsIgnoreCase(expacted_Emai)) {
			System.out.println("input Emai field is blank before enter value-----passed");
		}else {
			System.out.println("input Emai field value is present before entering value-----faile");
		}
		Emai.sendKeys("Mohit123@gmail.com");
		String expacted_Emai_vale="Mohit123@gmail.com";
		String actula_attribute_Emai=Emai.getAttribute("value");
		if(actula_attribute_Emai.equalsIgnoreCase(expacted_Emai_vale)) {
			System.out.println("expected Emai text value is show-----passed");
		}else {
			System.out.println("expected Emai text value is not show-----failed");
		}
		WebElement Website=driver.findElement(By.xpath("//input[@name=\"website\"]"));
		if(Website.isDisplayed()) {
			System.out.println("inputbox Website field is visible-----------passed");
		}else {
			System.out.println("inputbox Website field is not visible-----------failed");
		}
		if(Website.isEnabled()) {
			System.out.println("inputbox Website field is anable---------------passed");
		}else {
			System.out.println("inputbox Website field is disable---------------failed");
		}
		String expacted_Website="";
		String actual_Website=Website.getAttribute("value");
		if(actual_Website.equalsIgnoreCase(expacted_Website)) {
			System.out.println("input Website field is blank before enter value-----passed");
		}else {
			System.out.println("input Website field value is present before entering value-----faile");
		}
		Website.sendKeys("www.vtiger.com");
		String expacted_Website_vale="www.vtiger.com";
		String actula_attribute_Website=Website.getAttribute("value");
		if(actula_attribute_Website.equalsIgnoreCase(expacted_Website_vale)) {
			System.out.println("expected Website text value is show-----passed");
		}else {
			System.out.println("expected Website text value is not show-----failed");
		}
		WebElement LeadStatus=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		if(LeadStatus.isDisplayed()==true) {
			System.out.println("inputbox LeadStatus field is visible-----------passed");
		}else {
			System.out.println("inputbox LeadStatus field is not visible-----------failed");
		}
		if(LeadStatus.isEnabled()==true) {
			System.out.println("inputbox LeadStatus field is enable---------------passed");
		}else {
			System.out.println("inputbox LeadStatus field is disable---------------failed");
		}
		WebElement LeadStatuss=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		Select LeadStatus1=new Select(LeadStatuss);
		LeadStatus1.selectByVisibleText("Contact in Future");
		System.out.println("Industry is  Contact in Future");

		WebElement Rating=driver.findElement(By.xpath("//select[@name='rating']"));
		if(Rating.isDisplayed()==true) {
			System.out.println("inputbox Rating field is visible-----------passed");
		}else {
			System.out.println("inputbox Rating field is not visible-----------failed");
		}
		if(Rating.isEnabled()==true) {
			System.out.println("inputbox Rating field is enable---------------passed");
		}else {
			System.out.println("inputbox Rating field is disable---------------failed");
		}
		WebElement Ratings=driver.findElement(By.xpath("//select[@name='rating']"));
		Select Rating1=new Select(Ratings);
		Rating1.selectByVisibleText("Market Failed");
		System.out.println("Rating Market Failed");	

		WebElement annualRevenue=driver.findElement(By.xpath("//input[@name='annualrevenue']"));
		if(annualRevenue.isDisplayed()) {
			System.out.println("inputbox annualRevenuefield is visible-----------passed");
		}else {
			System.out.println("inputbox annualRevenue field is not visible-----------failed");
		}
		if(annualRevenue.isEnabled()) {
			System.out.println("inputbox annualRevenue field is anable---------------passed");
		}else {
			System.out.println("inputbox annualRevenue field is disable---------------failed");
		}

		String actual_annualRevenue=annualRevenue.getAttribute("value");
		String expacted_annualRevenue="";
		if(actual_annualRevenue.equalsIgnoreCase(expacted_annualRevenue)) {
			System.out.println("input annualRevenue field is blank before enter value-----passed");
		}else {
			System.out.println("input annualRevenue field value is present before entering value-----failed");
		}
		annualRevenue.clear();
		annualRevenue.sendKeys("03");
		String actula_attribute_annualRevenue=annualRevenue.getAttribute("value");
		System.out.println("actula_attribute_annualRevenue=== "+actula_attribute_annualRevenue);
		String expacted_annualRevenue_vale="03";
		if(actula_attribute_annualRevenue.equalsIgnoreCase(expacted_annualRevenue_vale)) {

			System.out.println("expected annualRevenue  value is show-----passed");
		}else {
			System.out.println("expected annualRevenue  value is not show-----failed");
		}
		WebElement EmployeesNo=driver.findElement(By.xpath("//input[@id='noofemployees']"));
		if(EmployeesNo.isDisplayed()) {
			System.out.println("inputbox EmployeesNofield is visible-----------passed");
		}else {
			System.out.println("inputbox EmployeesNo field is not visible-----------failed");
		}
		if(EmployeesNo.isEnabled()) {
			System.out.println("inputbox EmployeesNo field is anable---------------passed");
		}else {
			System.out.println("inputbox EmployeesNo field is disable---------------failed");
		}
		String expacted_EmployeesNo="";
		String actual_EmployeesNo=EmployeesNo.getAttribute("value");
		if(actual_EmployeesNo.equalsIgnoreCase(expacted_EmployeesNo)) {
			System.out.println("input EmployeesNo field is blank before enter value-----passed");
		}else {
			System.out.println("input EmployeesNo field value is present before entering value-----faile");
		}
		EmployeesNo.sendKeys("20");
		String expacted_EmployeesNo_vale="20";
		String actula_attribute_EmployeesNo=EmployeesNo.getAttribute("value");
		if(actula_attribute_EmployeesNo.equalsIgnoreCase(expacted_EmployeesNo_vale)) {
			System.out.println("expected EmployeesNo  value is show-----passed");
		}else {
			System.out.println("expected EmployeesNo  value is not show-----failed");
		}
		WebElement SecondaryEmail=driver.findElement(By.xpath("//input[@id='secondaryemail']"));
		if(SecondaryEmail.isDisplayed()) {
			System.out.println("inputbox SecondaryEmail field is visible-----------passed");
		}else {
			System.out.println("inputbox SecondaryEmail field is not visible-----------failed");
		}
		if(SecondaryEmail.isEnabled()) {
			System.out.println("inputbox SecondaryEmail field is anable---------------passed");
		}else {
			System.out.println("inputbox SecondaryEmail field is disable---------------failed");
		}
		String expacted_SecondaryEmail="";
		String actual_SecondaryEmail=SecondaryEmail.getAttribute("value");
		if(actual_SecondaryEmail.equalsIgnoreCase(expacted_SecondaryEmail)) {
			System.out.println("input SecondaryEmail field is blank before enter value-----passed");
		}else {
			System.out.println("input SecondaryEmail field value is present before entering value-----faile");
		}
		SecondaryEmail.sendKeys("Mohit123@gmail.com");
		String expacted_SecondaryEmail_vale="Mohit123@gmail.com";
		String actula_attribute_SecondaryEmail=SecondaryEmail.getAttribute("value");
		if(actula_attribute_SecondaryEmail.equalsIgnoreCase(expacted_SecondaryEmail_vale)) {
			System.out.println("expected SecondaryEmail  value is show-----passed");
		}else {
			System.out.println("expected SecondaryEmail  value is not show-----failed");
		}
		//Address Information
		WebElement Street=driver.findElement(By.xpath("//textarea[@name='lane']"));
		if(Street.isDisplayed()) {
			System.out.println("inputbox Street field is visible-----------passed");
		}else {
			System.out.println("inputbox Street field is not visible-----------failed");
		}
		if(Street.isEnabled()) {
			System.out.println("inputbox Street field is anable---------------passed");
		}else {
			System.out.println("inputbox Street field is disable---------------failed");
		}
		String expacted_Street="";
		String actual_Street=Street.getAttribute("value");
		if(actual_Street.equalsIgnoreCase(expacted_Street)) {
			System.out.println("input Street field is blank before enter value-----passed");
		}else {
			System.out.println("input Street field value is present before entering value-----faile");
		}
		Street.sendKeys("near by primary school bhagwati daspur bhadohi");
		String expacted_Street_vale="near by primary school bhagwati daspur bhadohi";
		String actula_attribute_Street=Street.getAttribute("value");
		if(actula_attribute_Street.equalsIgnoreCase(expacted_Street_vale)) {
			System.out.println("expected Street  value is show-----passed");
		}else {
			System.out.println("expected Street  value is not show-----failed");
		}
		WebElement PostalCode=driver.findElement(By.xpath("//input[@id='code']"));
		if(PostalCode.isDisplayed()) {
			System.out.println("inputbox PostalCode field is visible-----------passed");
		}else {
			System.out.println("inputbox PostalCode field is not visible-----------failed");
		}
		if(PostalCode.isEnabled()) {
			System.out.println("inputbox PostalCode field is anable---------------passed");
		}else {
			System.out.println("inputbox PostalCode field is disable---------------failed");
		}
		String expacted_PostalCode="";
		String actual_PostalCode=PostalCode.getAttribute("value");
		if(actual_PostalCode.equalsIgnoreCase(expacted_PostalCode)) {
			System.out.println("input PostalCode field is blank before enter value-----passed");
		}else {
			System.out.println("input PostalCode field value is present before entering value-----faile");
		}
		PostalCode.sendKeys("221402");
		String expacted_PostalCode_vale="221402";
		String actula_attribute_PostalCode=PostalCode.getAttribute("value");
		if(actula_attribute_PostalCode.equalsIgnoreCase(expacted_PostalCode_vale)) {
			System.out.println("expected PostalCode  value is show-----passed");
		}else {
			System.out.println("expected PostalCode  value is not show-----failed");
		}
		WebElement Country=driver.findElement(By.xpath("//input[@id='country']"));
		if(Country.isDisplayed()) {
			System.out.println("inputbox Country field is visible-----------passed");
		}else {
			System.out.println("inputbox Country field is not visible-----------failed");
		}
		if(Country.isEnabled()) {
			System.out.println("inputbox Country field is anable---------------passed");
		}else {
			System.out.println("inputbox Country field is disable---------------failed");
		}
		String expacted_Country="";
		String actual_Country=Country.getAttribute("value");
		if(actual_Country.equalsIgnoreCase(expacted_Country)) {
			System.out.println("input Country field is blank before enter value-----passed");
		}else {
			System.out.println("input Country field value is present before entering value-----faile");
		}
		Country.sendKeys("indian");
		String expacted_Country_vale="indian";
		String actula_attribute_Country=Country.getAttribute("value");
		if(actula_attribute_Country.equalsIgnoreCase(expacted_Country_vale)) {
			System.out.println("expected Country  value is show-----passed");
		}else {
			System.out.println("expected Country  value is not show-----failed");
		}
		WebElement PO_Box=driver.findElement(By.xpath("//input[@id='pobox']"));
		if(PO_Box.isDisplayed()) {
			System.out.println("inputbox PO_Box field is visible-----------passed");
		}else {
			System.out.println("inputbox PO_Box field is not visible-----------failed");
		}
		if(PO_Box.isEnabled()) {
			System.out.println("inputbox PO_Box field is anable---------------passed");
		}else {
			System.out.println("inputbox PO_Box field is disable---------------failed");
		}
		String expacted_PO_Box="";
		String actual_PO_Box=PO_Box.getAttribute("value");
		if(actual_PO_Box.equalsIgnoreCase(expacted_PO_Box)) {
			System.out.println("input PO_Box field is blank before enter value-----passed");
		}else {
			System.out.println("input PO_Box field value is present before entering value-----faile");
		}
		PO_Box.sendKeys("mohit kumar");
		String expacted_PO_Box_vale="mohit kumar";
		String actula_attribute_PO_Box=PO_Box.getAttribute("value");
		if(actula_attribute_PO_Box.equalsIgnoreCase(expacted_PO_Box_vale)) {
			System.out.println("expected PO_Box  value is show-----passed");
		}else {
			System.out.println("expected PO_Box  value is not show-----failed");
		}
		WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
		if(City.isDisplayed()) {
			System.out.println("inputbox City field is visible-----------passed");
		}else {
			System.out.println("inputbox City field is not visible-----------failed");
		}
		if(City.isEnabled()) {
			System.out.println("inputbox City field is anable---------------passed");
		}else {
			System.out.println("inputbox City field is disable---------------failed");
		}
		String expacted_City="";
		String actual_City=City.getAttribute("value");
		if(actual_City.equalsIgnoreCase(expacted_City)) {
			System.out.println("input City field is blank before enter value-----passed");
		}else {
			System.out.println("input City field value is present before entering value-----faile");
		}
		City.sendKeys("bhadohi");
		String expacted_City_vale="bhadohi";
		String actula_attribute_City=City.getAttribute("value");
		if(actula_attribute_City.equalsIgnoreCase(expacted_City_vale)) {
			System.out.println("expected City  value is show-----passed");
		}else {
			System.out.println("expected City  value is not show-----failed");
		}
		WebElement State=driver.findElement(By.xpath("//input[@id='state']"));
		if(State.isDisplayed()) {
			System.out.println("inputbox State field is visible-----------passed");
		}else {
			System.out.println("inputbox State field is not visible-----------failed");
		}
		if(State.isEnabled()) {
			System.out.println("inputbox State field is anable---------------passed");
		}else {
			System.out.println("inputbox State field is disable---------------failed");
		}
		String expacted_State="";
		String actual_State=State.getAttribute("value");
		if(actual_State.equalsIgnoreCase(expacted_State)) {
			System.out.println("input State field is blank before enter value-----passed");
		}else {
			System.out.println("input State field value is present before entering value-----faile");
		}
		State.sendKeys("Uttar pradesh");
		String expacted_State_vale="Uttar pradesh";
		String actula_attribute_State=State.getAttribute("value");
		if(actula_attribute_State.equalsIgnoreCase(expacted_State_vale)) {
			System.out.println("expected State  value is show-----passed");
		}else {
			System.out.println("expected State  value is not show-----failed");
		}
		WebElement Description=driver.findElement(By.xpath("//textarea[@name='description']"));
		if(Description.isDisplayed()) {
			System.out.println("inputbox Description field is visible-----------passed");
		}else {
			System.out.println("inputbox Description field is not visible-----------failed");
		}
		if(Description.isEnabled()) {
			System.out.println("inputbox Description field is anable---------------passed");
		}else {
			System.out.println("inputbox Description field is disable---------------failed");
		}
		String expacted_Description="";
		String actual_Description=Description.getAttribute("value");
		if(actual_Description.equalsIgnoreCase(expacted_Description)) {
			System.out.println("input Description field is blank before enter value-----passed");
		}else {
			System.out.println("input State Description value is present before entering value-----faile");
		}
		Description.sendKeys("This is good Employees");
		String expacted_Description_vale="This is good Employees";
		String actula_attribute_Description=Description.getAttribute("value");
		if(actula_attribute_Description.equalsIgnoreCase(expacted_Description_vale)) {
			System.out.println("expected Description  value is show-----passed");
		}else {
			System.out.println("expected Description  value is not show-----failed");
		}
		WebElement Savebutton=driver.findElement(By.xpath("//input[@name='button']"));
		if(Savebutton.isDisplayed()) {
			System.out.println(" Savebutton field is visible-----------passed");
		}else {
			System.out.println(" Savebutton field is not visible-----------failed");
		}
		if(Savebutton.isEnabled()) {
			System.out.println("Savebutton field is enable---------------passed");
		}else {
			System.out.println("Savebutton field is disable---------------failed");
		}
		WebElement Savebutton1=driver.findElement(By.xpath("//input[@name='button']"));
		//Savebutton1.click();
		
	}


}




