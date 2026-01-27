package objacte;

public class Testcode {

	public static void main(String[] args) {
		
	Schooltable ram= new Schooltable();	
	ram.studentName="mohan";
	ram.marks=89;
	Schooltable.totalStudent++;
	
	ram.dispaly();
	Schooltable.changeSchool("Eve");
	Schooltable ram1=new Schooltable();
	ram1.studentName="mohit";
	ram1.marks=95;
	Schooltable.totalStudent++;

	ram1.dispaly();
	
	Schooltable ram2=new Schooltable();
	ram2.studentName="rohit";
	ram2.marks=80;
	Schooltable.totalStudent++;
	
	ram2.dispaly();
	System.out.println("  total Student ---- "+Schooltable.totalStudent);
	}
}
