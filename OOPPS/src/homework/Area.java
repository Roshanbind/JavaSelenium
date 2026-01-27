package homework;

public class Area {

	public  void area(int side) {
	        System.out.println("one parameter wala area ====" + (side));
	    }

	 public void area(int length, int breadth) {
	        System.out.println(" two parameter wala area ===" + (length * breadth));
	    }
	 
	 public static void main(String[] args) {
		 Area	area=new Area();
		 area.area(5, 5);
	}
	 
}
