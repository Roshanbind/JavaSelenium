package interview_Questions;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumber(123456789);
		reverseNumber(45678);
		reverseNumber(987654321);
	}
	public static void reverseNumber(int number) {
		
		int num=number;
		int revNumber=0;
		int count=0;
		while(number  !=0) {
			int remaindor=number%10;
			revNumber=revNumber*10+remaindor;
			number=number/10;
			count++;
		}
		System.out.println("Orginal Numer: = "+num);
		System.out.println("Reverse Number: = "+revNumber);
		System.out.println("count   "+count);	

}
}
