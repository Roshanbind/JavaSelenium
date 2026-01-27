package homework;

public class Calculator {



	public int  add(int a,int b) {

		return 10+20;

	}
	public  int add(int x,int y,int z) {


		return 10+20+30;

	}
	public static void main(String[] args) {
		Calculator	cal=new Calculator();
	int	result=cal.add(10, 20);
		System.out.println(result);
		
//	    int	result=cal.add(10,20,30);
//		System.out.println(result);

	}





}
