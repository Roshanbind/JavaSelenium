package javadatabase;

public class Array {

	public static void main(String[] args) {
		String items[] []=	{
				{"apple","Mango","Orange","Banana","Grapes"},
				{"chilli","Potato","Tomato","Coriender","Ginger"},
				{"Thumbsub","Pepsi","Campa","Fanta","Sprite"},
				{"Eraser","Notebook","Pencil","Pen","Sharpner"}
				};
			
		for(int i=0;i<items.length;i++) {
			for(int j=0;j<items[i].length;j++) {
				System.out.print(items[i][j]+",");
			}
			System.out.println();
		}
		
		
	}

}
