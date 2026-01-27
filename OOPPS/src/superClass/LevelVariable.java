package superClass;

public class LevelVariable {
	
	  String name = "Class-Level Name"; 

	    void showName() {
	        String name = "Local Name"; 
	        
	        System.out.println(name);       
	        System.out.println(this.name);  
		
	        
	    }
	    public static void main(String[] args) {
	        LevelVariable obj = new LevelVariable();
	        obj.showName();   
	    }
	   
	    	
}
