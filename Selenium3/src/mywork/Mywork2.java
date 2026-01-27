package mywork;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mywork2 {

	public static void main(String[] args) throws InterruptedException {
		//input[@type='button']

		ChromeDriver	driver=new ChromeDriver();

		driver.get("http://localhost:8181/");

		WebElement username=driver.findElement(By.xpath("//input[contains(@name,'user_name')]"));
		username.sendKeys("admin");
		String	tag=username.getTagName();
		//System.out.println(tag);
		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'user_password')]"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[contains(@id,'submitButton')]"));

		login.click();
		Thread.sleep(2000);
		WebElement	leads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		leads.click();

		List<WebElement>clickbutton=driver.findElements(By.xpath("//td[@class='small']//td[@class='tabUnSelected']"));
		int	size=clickbutton.size();

		for(int i=0;i<size;i++) {
			WebElement weget=clickbutton.get(i);
			String	click_button	=weget.getText();
			System.out.println(click_button);
		}
		System.out.println("total click button======="+size);



		List<WebElement>Website=driver.findElements(By.xpath("//table[@class='lvt small']//a[@target='_blank']"));
		int	siiz=Website.size();
		System.out.println(siiz);
		for(int i2=0;i2<siiz;i2++) {
			WebElement	weeget=Website.get(i2);
			String	text=weeget.getText();
			System.out.println(text);
		}
		System.out.println("total Website name----"+Website.size());


		List<WebElement>names =driver.findElements(By.xpath("//table[@class='lvt small']//a[@title='Leads']"));
		int	siz=Website.size();
		System.out.println(siz);
		for(int i2=0;i2<siz;i2++) {
			WebElement	weeget=names .get(i2);
			String	text=weeget.getText();
			System.out.println(text);
		}
		System.out.println("total names  name----"+names .size());



		List<WebElement>email=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='email']/preceding-sibling::a"));
		for(int i4=0;i4<email.size();i4++) {
			WebElement	wegetButton=email.get(i4);
			String  text=wegetButton.getText();
			System.out.println(text);
		}
		System.out.println("total email-----"+email.size());



		List<WebElement>edit=driver.findElements(By.xpath("//table[@class='lvt small']//a[text()='edit']"));
		for(int i3=0;i3<edit.size();i3++) {
			WebElement	wegetButton=edit.get(i3);
			String  text=wegetButton.getText();
			System.out.println(text);

		}
		System.out.println("total edit button----"+edit.size());



		List<WebElement>abc=driver.findElements(By.xpath("//td[@class='searchAlph']"));
		int	siz1=abc.size();
		for(int i1=0;i1<siz1;i1++) {
			WebElement	weeget=abc.get(i1);
			String	alphabet=weeget.getText();
			System.out.println(alphabet);
		}
		System.out.println("total alphabet text====="+siz1);	



		List<WebElement>Delete_icons=driver.findElements(By.xpath("//table[@class='lvtBg']//a[text()='del']"));
		int	siz5=Delete_icons.size();	
		for(int i5=0;i5<siz5;i5++) {
			WebElement	weeget=Delete_icons.get(i5);
			String	Delete_button=weeget.getText();
			System.out.println(Delete_button);
		}
		System.out.println("total delete button---"+siz5);



		List<WebElement>name=driver.findElements(By.xpath("//table[@class='lvt small']//a[@title='Leads']"));
		int	siz6=Delete_icons.size();	
		for(int i6=0;i6<siz5;i6++) {
			WebElement	weeget=name.get(i6);
			String	text=weeget.getText();
			System.out.println(text);
		}
		System.out.println("total name======"+siz6);


		List<WebElement>select=driver.findElements(By.xpath("//div[@id='basicsearchcolumns_real']//select//option"));
		int	siz8=select.size();	
		for(int i6=0;i6<siz8;i6++) {
			WebElement	weeget=select.get(i6);
			String	text=weeget.getText();
			System.out.println(text);
		}
		System.out.println("total select option======"+siz8);


		List<WebElement>phone=driver.findElements(By.xpath("//table[@class='lvt small']//td[@onmouseout]"));
		int	size9=phone.size();	
		for(int i=0;i<size9;i++) {
			WebElement	weeget=phone.get(i);
			String	text=weeget.getText();
			System.out.println(i+"  "+text);
		}
		System.out.println("total select option======"+size9);



		List<WebElement> phone2=driver.findElements(By.xpath("//span[@vtfieldname='phone']/ancestor::td[@onmouseover]"));

		for(int i=0;i<phone2.size();i++) {
			WebElement weget= phone2.get(i);
			String phone_record=weget.getText();
			System.out.println(i+" "+phone_record);
		}


		List<WebElement>M_lettor=driver.findElements(By.xpath("//table[@class='lvt small']//a[contains(text(),'M')]"));
		for(int i=0;i<M_lettor.size();i++) {
			WebElement weget= M_lettor.get(i);
			String M_Lettorname_record=weget.getText();
			System.out.println(i+"  "+M_Lettorname_record);

		}

	}

}
