package myhomeWork;

public class ElectricitityBill {

	static int Bill;

	public static void main(String[] args) {
		Bill=ElectricitityBill.GetunitCharge();
		ElectricitityBill.PrinttotalBill();
		ElectricitityBill.sendNotification();
		ElectricitityBill.generatRecepite();
		ElectricitityBill.applyTex();

	}
	public static int GetunitCharge() {
		int Bill=250;

		return Bill;
	}
	public static void PrinttotalBill() {

		System.out.println("Total bill is "+Bill);

	}
	public static void sendNotification() {

		System.out.println("sms sent your bill of  "+Bill);

	}
	public static void generatRecepite() {

		System.out.println("Receipt Gernerate Amount paid "+Bill);

	}
	public static void applyTex() {

		System.out.println("GST (18%) applied  "+Bill);

	}
}
