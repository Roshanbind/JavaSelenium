package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateCartPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Continueshopping =driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		Continueshopping.click();
		WebElement	serchBox=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
		serchBox.sendKeys("Laptop");
		WebElement	clickButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickButton.click();
		WebElement	first_product = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']//span[text()='Samsung Galaxy Book4 (Gray, 16GB RAM, 512GB SSD) | 15.6\" Full HD Screen | Intel Core i5 1335U Processor | Windows 11 Home | MS Office 2021 | Fingerprint Reader | Intel Iris XE Graphics | RJ45 LAN Port'])[1]"));
		//first_product.click();
		WebElement	addToCartBtn=driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']"));
		addToCartBtn.click();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
		WebElement	productInCart=driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		if (productInCart.isDisplayed()) {
            System.out.println("Product is present in Cart");
        }else {
        	
        System.out.println("Cart is empty or product not found");
    }
		
	}

}
