package $008.weather;

public class StatisticsDisplay implements Observer, Display {
 
	public void update(double t,double h,double p) {
		display();
		System.out.println("Statistics Data:"
		                    +t+" : "+h+" : "+p);
		display();
	}	
	public void display() {
		System.out.println("******************");
	}
	 
}
 
