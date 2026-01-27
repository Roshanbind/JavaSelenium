package mywork;

public class StudentClass {

	String Student_name;
	int Student_age;
	
	public static void main(String[] args) {
		StudentClass stu1=new StudentClass();
		stu1.Student_name="Aman";
		stu1.Student_age=17;
		System.out.println(" Student name ==="+stu1.Student_name  +"===Student age   "+stu1.Student_age);
		
		
		StudentClass stu2=new StudentClass();	
		stu2.Student_name="Riya";
		stu2.Student_age=21;
		System.out.println(" Student name ==="+stu2.Student_name  +"===Student age   "+stu2.Student_age);
	}
	

}
