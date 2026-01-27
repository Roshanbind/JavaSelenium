package homework2;

public class Sum {

	public static void main(String[] args) {
		Sum.add(15,15);
		double z=Sum.add(15.5,30);

	}
	public static void add(int a,int b) {
		
		int x=a+b;
		System.out.println("Sum is "+ x);
		
	}
	public static double add(double a,double b) {
		double z=a+b;
		System.out.println("Sum is "+z);
		return z;
	
	}
}
