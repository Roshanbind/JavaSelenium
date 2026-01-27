package homework;

public class ClassFour {

	public static void main(String[] args) {
		ShowMarks(70,30);
		ShowMarks(100);
	}
	
	public static void ShowMarks(int theorymarks,int practicalmarks) {
		
		System.out.println("Theory marks     "+theorymarks);
		System.out.println("Practical marks  "+practicalmarks);
			
	}
	
	public static void  ShowMarks(int totalmarks) {
		
		System.out.println("Total marks     "+totalmarks);	
	}
	
}
