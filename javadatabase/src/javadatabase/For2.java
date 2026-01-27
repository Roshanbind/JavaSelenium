package javadatabase;

public class For2 {

	public static void main(String[] args) {
		//xyz();
		abc();
	}
	public static void xyz() {
		int t=10;
		for(int i=1;i<=10;i++) {
			System.out.println(t+"-"
						+""
							+""+i+"="+(i-10));
		}
		
	}
	public static void abc() {
		int y=10;
		for(int j=1;j<=10;j++) {
			System.out.println(y+"*"
						+""
							+""+j+"="+(j*10));
		}
	}
}
