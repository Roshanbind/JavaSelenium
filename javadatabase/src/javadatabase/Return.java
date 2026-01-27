package javadatabase;

public class Return {

	public static void main(String[] args) {
		//add(475,687,390);
		//add("hello","hii");
		add(456,677);

	}
	public static int add(int a,int b) {
		
		int w=a+b;
		System.out.println(w);
		return w;
	}
	public static String add(String a,String b) {
		String x=a+b;
		System.out.println(x);
		return x;
		
	}
	public static int add(int a,int b,int c) {
		int r=a+b+c;
		System.out.println(r);
		return r;
	}
}
