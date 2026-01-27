package actionsWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario_1 {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement	iframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframe);
		WebElement	iframe2=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(iframe2);
		WebElement	printtext=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		printtext.click();
		String	text=printtext.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
	}

}
