import org.openqa.selenium.WebElement;

public class Computer extends Math {

	@Override
	public int add(int a,int b) {
		
		return 0;
	}
	private int age;
	public int getAge() {
		
		return age;
	
	}
	public void setAge(int ageValue) {
	
		age=ageValue;
	}
	
	public void click (WebElement we ) {
		
		we.click();
		System.err.println("clicked successfuuly");
	}
	
	
	
	
	
	
}
