package homework2;

public class CustomerBuys {

	public static void main(String[] args) {
		int item=CustomerBuys.gottotalcost();
		System.out.println("total cost of items price  "+item);
	}
	public static int gottotalcost() {
		int firstitem=400;
		int Seconditem=700;
		int totalcost= firstitem+Seconditem;
		return totalcost;
		
		
		
	}
}
