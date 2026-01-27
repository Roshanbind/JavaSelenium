package homework;

public class Print {

	 void print(String s) {
	        System.out.println("String version: " + s);
	    }

	    void print(int i) {
	        System.out.println("int version: " + i);
	    }

	    void print(double d) {
	        System.out.println("double version: " + d);
	    }
	    
	    public static void main(String[] args) {
	    	Print	pri=new Print();
	    	pri.print(10.5f);
	    	
		}
}
