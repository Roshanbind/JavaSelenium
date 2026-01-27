package javadatabase;

public class BusinessTrip {

	public static void main(String[] args) {
		short hotalstay=1200;
		short food=500;
		short transport=300;
		short perday=3;
		int dailyexpenses=hotalstay+food+transport;
		System.out.println(dailyexpenses);
		int total=dailyexpenses*perday;
		System.out.println(total);
		
		double discount=80.5;
		double discoutpay=total*discount/100;
		System.out.println(discoutpay);
		
		double totalpay= total-discoutpay;
		System.out.println(totalpay);
		
		

	}

}
