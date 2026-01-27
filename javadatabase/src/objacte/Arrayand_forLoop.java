package objacte;

public class Arrayand_forLoop {
	public static String[] arr;

	public static void main(String[] args) {
		//xyz();
		add();




	}
	public static void xyz() {	
		int a=100;
		int b=200;
		Arrayand_forLoop x=new Arrayand_forLoop();Arrayand_forLoop[] y= {new Arrayand_forLoop(),x};

		Arrayand_forLoop[] y1= {new Arrayand_forLoop(),x};
		int itemCount=y1.length;
		for(int i=0;i<itemCount;i++) {

			System.out.println("hello");
		}

	}
	public static void add() {
		double[] p=new double[7];
		abc();
		int[] k=new int[1000000];
		int count=k.length;
		for(int i=0;i<count;i++) {
			k[i]=5*i;
		}

		int a=100;
		int b=200;
		int[]c= {a,b,324};
		System.out.println("");

	}
public static void abc() {
	arr=new String[5000000];
	System.out.println("");
	
	
}
}
