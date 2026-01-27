package myhomeWork;

public class Collegeclass2 {
	
	static int fee;
	
	public static void main(String[] args) {
		 fee=Collegeclass.getSemesterFee();
		 
		Collegeclass2.receipt();
		Collegeclass2.scholarship();
		Collegeclass2.calculate();
		Collegeclass2.notefication();
		Collegeclass2.feesummary();
		
		}
		public static int getSemesterFee() {
			
			int fee=5500;
			return fee;
		}
		public static void receipt() {
			System.out.println("Receipt fee "+fee);
		}
		public static void calculate() {
			
			System.out.println("calculate fine "+fee);
		}
		public static void scholarship() {
			
			System.out.println("apply scholarship "+fee);
		}
		public static void notefication() {
			
			System.out.println("send email notification "+fee);
		} 
		public static void feesummary() {
			
			System.out.println("Generate fee summary "+fee);
		}
	}


