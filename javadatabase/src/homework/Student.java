package homework;

public class Student {

	
	
	public static void main(String[] args) {
		String schoolName=Student.GateSchoolName("rohit");
		System.out.println("SchoolName  "+schoolName);
		Student.SchoolNameSlogol(schoolName,"mohit");
		
	}
	public static String GateSchoolName(String name) {
		String school="Expert view automation";
		System.out.println("schoolName  "+"\nStudentName "+school+name);
		
		return  school;
	}
	public static void SchoolNameSlogol(String schoolName,String name) {
		System.out.println("schoolName  "+schoolName+"\nStudentName  "+name);
		
		
		
	}
}
