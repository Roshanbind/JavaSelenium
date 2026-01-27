package mycode;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAcu {

	public static void main(String[] args) {
//		 VerifyCreateLeadFuctioality();
//		 equalmethode();
		equalmethode();
		equalse();
		equalmethode1();
		
	}
	public static void VerifyCreateLeadFuctioality() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		String expectedTitle="vtiger CRM 5 - Commercial Open Source CRm";
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("actualTitle and expectedTitle are matched----"+"title validation passed");
		}else {
			System.out.println("actualTitle and expectedTitle are matched----"+"title validation failed");
		}
		
	}
	public static void equalmethode() {
		//Distic name
		String name1 ="Bhadohi";
		String name2="BHADOHI";
		if(name1.equals(name2)) {
			System.out.println("Matched");
				
		}else {
			System.out.println("Not Matched");
		}
	}
	public static void equalse() {
		//State name
		String name3="UtterPradesh";
		String name4="UTTERPRADESH";
		if(name3.equals(name4)){
			System.out.println("User name --passed");
		} else {
			System.out.println("user name  not Failed");
		}
			
  }
	public static void equalmethode1() {
		//Country name
		String name2="India";
		String name3="INDIA";
		if(name2.equalsIgnoreCase(name3)) {
			System.out.println("user name ---passed");
			
		}else {
			System.out.println("user name not Failed");
		}
		
	}
			
}

		
	


