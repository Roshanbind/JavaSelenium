package javadatabase;

public class Static {
	static int a;
	public static void main(String[] args) {
		//int  a=7;
		System.out.println(a);
		abc.xyz();
	}
	final class abc{
		static int z;
		
		
		public static void xyz() {
			
			int x=100;
			System.out.println(x);
		}
	}
}
