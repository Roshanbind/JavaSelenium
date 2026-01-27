package interview_Questions;

public class If_and_else {

	public static void main(String[] args) {
		evenOdd(20);
		evenOdd(21);
		evenOdd(19);
		evenOdd(40);
		
	}
	public static void evenOdd(int a) {	
		
		if(a%5==0) {
	System.out.println("number is even---"+a);
		}else {
			System.out.println("number is odd---"+a);
		}
	}


	}


