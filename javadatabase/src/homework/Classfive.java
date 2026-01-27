package homework;

public class Classfive {

	public static void main(String[] args) {
		printbill("parleG",5);
		printbill(5,"parleG");
		
		
	}
	public static void printbill(String itemName,int quantity) {
		
		System.out.println("itemName    "+itemName);
		System.out.println("quantity    "+quantity);
	}
	public static void printbill(int quantity,String itemName) {
		
		System.out.println("itemName    "+itemName);
		System.out.println("quantity    "+quantity);
		
	}
}
