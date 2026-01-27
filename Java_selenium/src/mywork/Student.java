package mywork;

public class Student {

	static String SchoolName="EVA"; 
	String StudentName;
	static int classname=5;
	String FatherName;
	String MotherName;

	Student(String name,String name1,String name2,int num){
		StudentName=name;
		classname=num;
		FatherName=name1;
		MotherName=name2;
	}

	public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("student name---"+StudentName);
		System.out.println("class name is------"+classname);
		System.out.println("school name---"+SchoolName);
		System.out.println("Father name is-----"+FatherName);
		System.out.println("Mother name is ----"+MotherName);
	} 

	public static void main(String[] args) {
		
		Student stu=new Student("Rohit","Mohit","Radha",4);
		stu.display();
		Student stu1=new Student("Roshan","Ram","Mamta",+5);
		stu1.display();
		Student stu2=new Student("Rahul","Kishan","Seeta",+6);
		stu2.display();
		Student stu3=new Student("Ramesh","Shyam","Reeta",+7);
		stu3.display();

	}
	public static void add(String name,String SchoolName) {
		Student	stu2=new Student("mohit","EVE");
		stu2.display();

	}

} 








