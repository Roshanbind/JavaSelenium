package homework;

public class ClassOne {

	public static void main(String[] args) {
		addNumbers(300, 435);
		addNumbers(200,500, 450);
	}
	public static void addNumbers(int a,int b) {
		int c=a+b;
		System.out.println("addition two integers  "+c);
		
	}
	public static void addNumbers(int x,int y,int z) {
		int d=x+y+z;
		System.out.println("addition three integers  "+d);
		
	}
}
