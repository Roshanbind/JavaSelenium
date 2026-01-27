package superClass;

public class  Chiild extends Parentt {
    int value = 1000;
    

    void checkValues() {
    	
    
        System.out.println(value);       
        System.out.println(this.value);  
        System.out.println(super.value); 
    }
    public static void main(String[] args) {
        Chiild obj = new Chiild();
        obj.checkValues();
        
    }
}



