package javadatabase;

public class Overloded {

	public static void main(String[] args) {
		m1(5);
		m1(45,67);
		m1("hello",100);
		m1(200,"hii");
		m1();

	}
	public static void m1(int z) {
		System.out.println(z);
	}
	public static void m1(int x,int y) {
		int s;
		s=x*x;
		
		System.out.println(s);
	}
	public static void m1() {
		System.out.println();
		
	}
	public static void m1(int a,String b) {
		System.out.println(a+b);
	}
	public static void m1(String r,int d) {
		System.out.println(r+d);
	}
}
