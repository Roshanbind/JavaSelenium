package homeWork2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement	username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		WebElement	usepassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		usepassword.sendKeys("admin");
		WebElement	loginButton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();
		WebElement firstleadSel=driver.findElement(By.xpath("//input[@id='134']"));
		firstleadSel.click();
		WebElement Edit=driver.findElement(By.xpath("(//a[text()='edit'])[1]"));
		Edit.click();
		String newNumber="2345679836";
		WebElement updatePhoneNumber = driver.findElement(By.name("phone"));
		String	oldPhoneNum=updatePhoneNumber.getAttribute("value");
		System.out.println(oldPhoneNum);
		Thread.sleep(2000);
		updatePhoneNumber.clear();
		updatePhoneNumber.sendKeys(newNumber);
		String	newPhoneNum=updatePhoneNumber.getAttribute("value");
		System.out.println(newPhoneNum);
		WebElement	saveButton=driver.findElement(By.xpath("//input[@name='button']"));
		saveButton.click();
		
		if (newNumber.equals(newPhoneNum)) {
			System.out.println("Phone number updated successfully");
		} else {
			System.out.println("Phone number update failed");
		}


	}

}
