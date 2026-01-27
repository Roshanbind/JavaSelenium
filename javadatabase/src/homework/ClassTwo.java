package homework;

public class ClassTwo {

	public static void main(String[] args) {
		 StudentInfo(34);
		 StudentInfo(34,"Mohit");
	}
	public static void StudentInfo(int rollNumber) {
		
		System.out.println("Student rollnumber  -  "+rollNumber);
		
	}
	public static void StudentInfo(int rollNumber,String name ) {
		
		System.out.println("Student rollnumber  -  "+rollNumber);
		System.out.println("Student name       -  "+name);
	}
}
