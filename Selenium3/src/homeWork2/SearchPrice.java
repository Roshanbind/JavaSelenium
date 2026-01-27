package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPrice {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
//		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
//		Continueshopping.click();
		WebElement	serchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchBox.click();
		Thread.sleep(2000);
		serchBox.sendKeys("Apple iPhone 15");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		Thread.sleep(2000);
		WebElement first_product=driver.findElement(By.xpath("//span[text()='iPhone 15 (128 GB) - Black']"));
		String	Product_Title=first_product.getText();
		System.out.println("first_product title====="+Product_Title);
		WebElement first_product_price=driver.findElement(By.xpath("(//span[contains(text(),'iPhone 15')]/ancestor::div[@data-component-type='s-search-result']//span[@class='a-price-whole'])[1]"));
		//first_product_price.click();
		String price=first_product_price.getText();
		System.out.println("Product Price==="+price);
		 if (first_product.isDisplayed()){
             System.out.println("Title is empty");
         }else {
        	 System.out.println("Title is not empty");
         }
		 if (first_product_price.isDisplayed()){
             System.out.println("Price is empty");
         }else {
        	 System.out.println("Price is not empty");
         }
		 Thread.sleep(2000);
         driver.quit();
	}

}
