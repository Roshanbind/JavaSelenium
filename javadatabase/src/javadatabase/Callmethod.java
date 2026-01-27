package javadatabase;

public class Callmethod {

	public static void main(String[] args) {
		
		Shopping();
		Traveling();
		 Booking();
		 Renewal();
		 BusinessTrip() ;
		
		

	}
	public static void Shopping() {
	
		int shirt;
		shirt=2000;
		int shirtcount;
		shirtcount=3;
		int shirtprice;
		shirtprice=shirt*shirtcount;
		int pant;
		pant=1700;
		int pantcount;
		pantcount=4;
		int pantprice;
		pantprice=pant*pantcount;
		int shose;
		shose=3000;
		int shosecount;
		shosecount=5;
		int shoseprice;
		shoseprice=shose*shosecount;
		int total;
		total=shirtprice+pantprice+shoseprice;
		//System.out.println(total);
		int discountpercent;
		discountpercent=27;
		int GSTdiscountpercent;
		GSTdiscountpercent=12;
		int discount;
		int GSTdiscount;
		discount=total*discountpercent/100;
		//System.out.println(discount);
		GSTdiscount=total*GSTdiscountpercent/100;
		//System.out.println(GSTdiscount);
		int nettotal;
		nettotal=total-discount+GSTdiscount;
		System.out.println(nettotal);

	}
	
	public static void Traveling() {
	
			short hotal=1200;
			short foodperday=500;
			short transport=300;
			int total=hotal+foodperday+transport;
			//System.out.println(total);
			double totalexpence=80.5;
			double perday=total*totalexpence/100;
			//System.out.println(perday);
			double expence=total-perday;
			//System.out.println(expence);
			short countday=3;
			double allamount=expence*countday;
			System.out.println(allamount);
		
		}
	
	public static void Booking() {
		
		short ticketprice=250;
		short countfriend=5;
		int ticketpay=ticketprice*countfriend;
		//System.out.println(ticketpay);
		short boughtSnacks=600;
		short discount=300;
		int finalamount=ticketpay+boughtSnacks-discount;
		//System.out.println(finalamount);
		int perticket=finalamount/countfriend;
		System.out.println( perticket);
		
	}
	
	public static void Renewal() {
		
		int subscriptionfee=300;
		int Gstappliedfee=5;
		int GST=subscriptionfee*Gstappliedfee/100;
		//System.out.println(GST);
		int sertificateadd=500;
		int onadd=subscriptionfee+ GST+sertificateadd;
		System.out.println(onadd);
		
		
	}
	public static void BusinessTrip() {
	
		short hotalstay=1200;
		short food=500;
		short transport=300;
		short perday=3;
		int dailyexpenses=hotalstay+food+transport;
		//System.out.println(dailyexpenses);
		int total=dailyexpenses*perday;
		//System.out.println(total);
		
		double discount=80.5;
		double discoutpay=total*discount/100;
		//System.out.println(discoutpay);
		
		double totalpay= total-discoutpay;
		System.out.println(totalpay);
		
		
		
		}
}
