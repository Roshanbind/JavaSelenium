package javadatabase;


public class Traveling2 {

	public static void main(String[] args) {
		short hotal=1200;
		short foodperday=500;
		short transport=300;
		int total=hotal+foodperday+transport;
		System.out.println(total);
		double totalexpence=80.4;
		double perday=total*totalexpence/100;
		System.out.println(perday);
		double expence=total-perday;
		System.out.println(expence);
		short countday=3;
		double allamount=expence*countday;
		System.out.println(allamount);

	}

}
