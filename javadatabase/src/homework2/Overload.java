package homework2;

public class Overload {

	public static void main(String[] args) {
		Overload.multiply(4,3);
		Overload.multiply(4,3,10);
		Overload.number(45, 57, "mohit", "rohit", 47, 94);

	}
	public static void multiply(int a,int b) {
		
		int x=a*b;
		System.out.println("Result  "+x);
		
	}
	
	public static void multiply(int a,int b,int c) {
		int z=a*b*c;
		System.out.println("Result  "+z);
	
		
	}
	public static void number(int x,int y,String z,String a,int b,int c) {
		//int r=x+y+b+c;
		System.out.println("Result  "+x+"  "+y+" "+z+"  "+"  "+a+" "+b+"  "+c+"  ");
		
	}
}
