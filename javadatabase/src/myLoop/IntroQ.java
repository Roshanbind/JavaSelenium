  package myLoop;

public class IntroQ {

	public static void main(String[] args) {
		//evenOdd(20);
		Studentmarks(95);
		
	}	
	public static void evenOdd(int a) {	
		
		if(a%2==0) {
	System.out.println("number is even---"+a);
		}else {
			System.out.println("odd number is---"+a);
		}
	}	
	public static void Studentmarks(int mark) {
		if(mark>=80) {
			System.out.println("Grade A---"+mark);
		}else if(mark>=60) {
			System.out.println("Grade B----"+mark);
		}else if(mark>=45) {
			System.out.println("Gread C--"+mark);
		}else {
			System.out.println("Fail");
		}
		
		
		
		
		
	}
	
	

}
