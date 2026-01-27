package interview_Questions;

public class Classwork {

	public static void main(String[] args) {
		//recurstion(1, 100);
		//recurstion(61,91);
		recurstion(21, 51);

	}
	public static void recurstion(int n,int num) {

		while(n > num) {
			return;
		}
		System.out.println("Currect number---"+n);
		recurstion(n+1,num);				
	}
}


