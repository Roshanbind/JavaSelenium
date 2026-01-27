package homwork1;

public class DragDRop {

	public static void main(String[] args) {
		DragDRop obj=new DragDRop();

		obj.doubleclick().moveToElemet().build().perform();
		
		
	}
	public  DragDRop doubleclick() {
		int x;
		return this;
	}
	public  DragDRop  moveToElemet() {
		return this;
		
	}
	public DragDRop contextclick () {
		return this;
		
	}
	public DragDRop build() {
		return this;
	}
	public DragDRop perform() {
		return this;
		
	}

}
