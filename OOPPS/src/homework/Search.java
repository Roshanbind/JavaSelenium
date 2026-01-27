package homework;

public class Search {

public 	void search(String name) {
        System.out.println("String number call " + name);
    }

   public void search(int id) {
        System.out.println("int Number call " + id);
    }
    
    public static void main(String[] args) {
    	Search	find=new Search();
    	find.search("101");
	}
}


