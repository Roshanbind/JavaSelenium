package homework2;

public class MobileRecherge {

	public static void main(String[] args) {
	int plan=MobileRecherge.getRechargeamount();

	MobileRecherge.printRechargeDetails(plan);
	}
	public static int getRechargeamount() {
		int a=199;
		System.out.println("my plan "+a);
		return a;	
	}
	public static void printRechargeDetails(int amount) {
		
		System.out.println("Recharge sussessful  "+amount);
	}
}
