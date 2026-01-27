package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_Password_Field_Validation {

	public static void main(String[] args) {
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
		String expactedtagName="input";
	    String ActualtagName=username.getTagName();
	    if(ActualtagName.equals(expactedtagName)) {
	    	System.out.println("Get tag name of username field input-------passed");
	    	
	    }else {
	    	System.out.println("Get tag name is not username field input------failed");
	    }
	    username.clear();
	    username.sendKeys("admin");
	    
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
		String expactedtagName1="input";
	    String ActualtagName2=userpassword.getTagName();
	    if(ActualtagName2.equals(expactedtagName1)) {
	    	System.out.println("Get tag name of userpassword field input-------passed");
	    	
	    }else {
	    	System.out.println("Get tag name is not userpassword field input------failed");
	    }
	    userpassword.clear();
	    userpassword.sendKeys("wrongpassword");
	    
			
	}

}
