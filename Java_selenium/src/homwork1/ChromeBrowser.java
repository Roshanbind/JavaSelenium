package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String x="https://www.instagram.com/accounts/login/";
		driver.get(x);
		By y=By.name("username");
		WebElement	email=driver.findElement(y);
		email.sendKeys("rahul123@gmail.com");
		By z=By.name("password");
		WebElement	pass=driver.findElement(z);
		pass.sendKeys("rahul");
		By s=By.name("");
		WebElement login=driver.findElement(s);
		login.click();
		By creatNewAccount=By.id("");
		WebElement newAccount=driver.findElement(creatNewAccount);
		newAccount.click();

	}

}
