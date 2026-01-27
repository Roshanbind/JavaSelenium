package homework;

public class Show {
	
    static void show(double d) {
        System.out.println("double data type called: " + d);
    }

    static void show(float f) {
        System.out.println("float data type called: " + f);
    }

	public static void main(String[] args) {
		show(5.5);
	}

}
