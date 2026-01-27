package interview_Questions;

public class Student_marks {

	public static void main(String[] args) {
		Studentmarks(85);
		Studentmarks(60);
		Studentmarks(90);
		Studentmarks(55);
		Studentmarks(43);
	}
		public static void Studentmarks(int mark) {
			if(mark>=80) {
				System.out.println("Grade A---"+mark);
			}else if(mark>=60) {
				System.out.println("Grade B----"+mark);
			}else if(mark>=45) {
				System.out.println("Gread C--"+mark);
			}else {
				System.out.println("Fail");
			}

	}

}
