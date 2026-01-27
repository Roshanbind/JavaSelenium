package homework;

public class Display {
	
	 static void display(int a) {
	        System.out.println("Single int data type called: " + a);
	    }
	 
	    static void display(int... a) {
	        System.out.print("data type int.... called: "+a);
	       
	    }

	public static void main(String[] args) {
		
		display(10);
		
		
		
		
	}

}
