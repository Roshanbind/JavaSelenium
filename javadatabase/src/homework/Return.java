package homework;

public class Return {

	public static void main(String[] args) {
		int Number2=Return.Maxvalue();
		int result=Return.Multiply();
		int collegeCode =Return.College() ;
		
	}
	public static int Maxvalue() {
		int Number1=83;
		int Number2=89;
		System.out.println("Maximum is    "+Number2); 
		return Number2;
		
	}
	public static int Multiply() {
		int a=100;
		int b=35;
		int c=5;
		int result=a*b*c;
		System.out.println("result        "+result);
		return result;
		
	}
	public static int College() {
		int collegeCode=10;
		System.out.println("CollegeCode   "+collegeCode);
		return collegeCode;
		
	}
}
