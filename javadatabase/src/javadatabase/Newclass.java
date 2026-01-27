package javadatabase;

public class Newclass {

	public static void main(String[] args) {

		//Myclass2.Substraetion();
		//Myclass2.minus();
		//Myclass2.name();
		//add(500,600);
		//minus(1000,500,200);
		//divide(500, 50, 5);
		//pluse(600,700,800,387);
		//sum(236.5,485.5,923.4);
		xyz(false);
	}
	public static void add(int a,int b) {
		a=100;
		b=400;
		int	z=a+b;
		System.out.println(z);
	}

	public static void minus(int x,int y,int z) {
		x=2000;
		y=1000;
		z=500;
		int r=x-y-z;
		System.out.println(r);
	}
	public static void divide(int a,int b,int c) {
		a=1000;
		b=100;
		c=5;
		int z=a/b/c;
		System.out.println("divide method excues--"+z);

	}
	public static void pluse(short a,short b,short c,short d) {
		
		int z=a+b+c+d;
		System.out.println(z);
		
	}
	public static void sum(double x,double y,double z) {
		
		double r=x+y+z;
		System.out.println(r);
		
		
  }
	public static void xyz(boolean b) {
		
		System.out.println(b);
	}
	}