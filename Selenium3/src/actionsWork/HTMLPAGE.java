package actionsWork;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HTMLPAGE {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver	driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

		WebElement we2=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(we2);

		WebElement we=driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		driver.switchTo().frame(we);
		WebElement we3=driver.findElement(By.xpath("//iframe[@src='https://2391dcc9ee7168e42a55abd45ae91019.safeframe.googlesyndication.com/safeframe/1-0-45/html/container.html?n=2']"));
		driver.switchTo().frame(we3);
	
		Thread.sleep(2000);	
		WebElement	webe=driver.findElement(By.xpath("//a[text()='HTML']"));
		webe.click();
		String	text=webe.getText();
		System.out.println(text);
	
		driver.switchTo().defaultContent();




	}

}
