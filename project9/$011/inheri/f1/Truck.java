package $011.inheri.f1;

public class Truck extends Car {
	private double payLoad;

	public Truck(int wheels, double weight, int loader, double payLoad) {
		super(wheels, weight, loader);
		this.payLoad = payLoad;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("payload = "+payLoad);
	}
	
}
