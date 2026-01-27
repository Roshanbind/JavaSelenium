package javadatabase;

public class Booking {
	
	public static void main(String[] args) {
		
		short ticketprice=250;
		short countfriend=5;
		int ticketpay=ticketprice*countfriend;
		System.out.println(ticketpay);
		short boughtSnacks=600;
		short discount=300;
		int finalamount=ticketpay+boughtSnacks- discount;
		System.out.println(finalamount);
		int perticket=finalamount/countfriend;
		System.out.println( perticket);
			
		
	}

}
