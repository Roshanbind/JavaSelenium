package superClass;

public class Child extends Parnet {
    void message() {  
        System.out.println("Child Message");
    }

    void showMessage() {
        message();        
        super.message();  
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessage();
    }

	
		
	}



