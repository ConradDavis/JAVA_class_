package $008.weather;

public class ForcastDisplay implements Observer, Display {
 
	public void update(double t,double h,double p) {
		display();
		System.out.println("Forcast Data:"
		                    +t+" : "+h+" : "+p);
		display();
	}	
	public void display() {
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
	 
}
 
