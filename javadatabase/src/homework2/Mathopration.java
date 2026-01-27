package homework2;

public class Mathopration {

	public static void main(String[] args) {
		
		int val =Mathopration.Gatevalue();
		System.out.println("Gatevalue is  "+val);
		Mathopration.printresult(val);
	}
	public static int Gatevalue() {
	int	a=30;
	int	b=50;
	int z=a+b;
	System.out.println("value is  "+z);
	return z;
		
		
	}
	public static void  printresult(int result) {
		
		System.out.println("print result  "+result);
		
		
	}
}
