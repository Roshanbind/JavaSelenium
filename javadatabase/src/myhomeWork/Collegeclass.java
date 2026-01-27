package myhomeWork;

public class Collegeclass {

	public static void main(String[] args) {
	int fee=Collegeclass.getSemesterFee();
	Collegeclass.receipt(fee);
	Collegeclass.scholarship(fee);
	Collegeclass.calculate(fee);
	Collegeclass.notefication(fee);
	Collegeclass.feesummary(fee);
	
	}
	public static int getSemesterFee() {
		
		int fee=5500;
		return fee;
	}
	public static void receipt(int fee) {
		System.out.println("Recript fee "+fee);
	}
	public static void calculate(int fee) {
		
		System.out.println("calculate fine "+fee);
	}
	public static void scholarship(int fee) {
		
		System.out.println("apply scholarship "+fee);
	}
	public static void notefication(int fee) {
		
		System.out.println("send email notification "+fee);
	} 
	public static void feesummary(int fee) {
		
		System.out.println("Generate fee summary "+fee);
	}
}
