package homwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	/*we  lunch chromeDriver and create chromedriver object.
	 * we hit url and open amazon page/
	 * 
	 * 
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		String k="https://www.amazon.in/";
		driver.get(k);
		By x=By.id("twotabsearchtextbox");
		WebElement searchBox=driver.findElement(x);
		searchBox.sendKeys("bhut book");
		By y=By.id("nav-search-submit-button");
		WebElement searchButton=driver.findElement(y);
		searchButton.click();

	}

}
