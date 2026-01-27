package javadatabase;

public class Parameters {

	
	public static void main (String[] args) {
		sum(348,756,576);
		sum(346,687);
		
		
	}
	public static void sum(int num1,int num2,int num3) {
		//declar initialize
		int result=num1+num2+num3;
		System.out.println(result);
	}
	public static void sum(int num1,int num2) {
		int result=num1+num2;
		System.out.println(result);
	}
}
