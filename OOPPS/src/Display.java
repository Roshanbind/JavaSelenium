
public class Display {

	 static void display(Object o) {
	        System.out.println("Object method  called: " + o);
	    }
	    
	   
	    static void display(String s) {
	        System.out.println("String method  called: " + s);
	    }
	
	
	public static void main(String[] args) {
		display("Hello");
	}
	
	
}
