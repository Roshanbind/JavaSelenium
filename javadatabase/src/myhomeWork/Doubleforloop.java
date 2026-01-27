package myhomeWork;

public class Doubleforloop {

	public static void main(String[] args) {
		//Star();
		//num1();
		//
		num2();
	//num3() ;

	}
	public static void Star() {
		for(int i=1;i<=10;i++) {
			for(int a=1;a<=10;a++) {
			System.out.print("*");	
			}
			System.out.println();
		}
	}
	public static void num1() {
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void num2() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void num3() {
		for(int b=9;b>=1;b--) {
			for(int x=1;x<=9;x++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
