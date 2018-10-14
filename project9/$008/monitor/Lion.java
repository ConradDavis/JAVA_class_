package $008.monitor;

public class Lion implements Beast, Action {
 
	public void update(int count) {
		this.act();
		System.out.println("Count = "+count);
	}
	 
	public void act() {
		System.out.println("$$$$Lion roaring.....");
	}
	 
}
 
