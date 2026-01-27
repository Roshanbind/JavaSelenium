package homework;

public class Classthree {

	public static void main(String[] args) {
		empSal("Ramesh");
		empSal("Ramesh",22);

	}
	public static void empSal( String empName) {
		
		System.out.println("Employ name  "+empName);
		
	}
	public static void empSal(String empName,int age) {
		
		System.out.println("Employ name  "+empName+ "\n" +"Employ age   "+age);
		
	}
}
