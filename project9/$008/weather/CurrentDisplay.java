package $008.weather;

public class CurrentDisplay implements Observer, Display {
 
	
	public void update(double t,double h,double p) {
		display();
		System.out.println("Current Data:"
		                    +t+" : "+h+" : "+p);
		display();
	}	
	public void display() {
		System.out.println("------------------");
	}
	 
}
 
