package homework2;

public class Studentresult {

	public static void main(String[] args) {
		int total=Studentresult.studentmark();
		System.out.println("A student total marks "+total);

	}
	public static int studentmark() {
		int subject1=40;
		int subject2=45;
		int gotmark=subject1+subject2;
		return gotmark;
		
		
	}

}
