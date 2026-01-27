package javadatabase;

public class Shooping {

	public static void main(String[] args) {
		short jeans=1500;
		short countjeans=4;
		int jeansprice=jeans*countjeans;
		short shirts=1200;
		short shirtscount=5;
		int shirtsprice=shirts*shirtscount;
		double shoes=4550.46;
		double shoescount=6;
		double shoesprice=shoes*shoescount;
		double total=jeansprice+shirtsprice+shoesprice;
		System.out.println(total);
		
		double discount=20.5;
		double discountpay=total*discount/100;
		System.out.println(discountpay);
		double allamount= total-discountpay;
		System.out.println(allamount);
		
		double GST=13.5;
		double GSTpay=total*GST/100;
	    System.out.println(GSTpay);
	    
	    double alltotal=total+GSTpay-allamount;
	    System.out.println(alltotal);
	
	}

}
