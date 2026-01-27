package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPageAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		Thread.sleep(2000);
		WebElement	serchBox=driver.findElement(By.xpath("//div[@class='nav-search-field ']//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		serchBox.sendKeys("Laptop");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		WebElement	first_product = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']//span[text()='Samsung Galaxy Book4 (Gray, 16GB RAM, 512GB SSD) | 15.6\" Full HD Screen | Intel Core i5 1335U Processor | Windows 11 Home | MS Office 2021 | Fingerprint Reader | Intel Iris XE Graphics | RJ45 LAN Port'])[1]"));
		//first_product.click();
		WebElement	addToCartBtn=driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']"));
		addToCartBtn.click();
		Thread.sleep(2000);
		WebElement	cartIcon=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		if(cartIcon.isDisplayed()) {
			cartIcon.click();	
			System.out.println("Cart page is open successfully");
		} else {
			System.out.println("Cart page not opened");
		}
		WebElement cartCount = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        String count = cartCount.getText();
        System.out.println("Cart contains " + count + " items");
        int expectedItems = 2;
        if(Integer.parseInt(count) == expectedItems) {
            System.out.println("Cart item count matches expected: " + expectedItems);
        } else {
            System.out.println("Cart item count mismatch. Expected: " + expectedItems + ", Found: " + count);
        }
	}

}
