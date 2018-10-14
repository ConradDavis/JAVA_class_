package $011.inheri.f1;

public class Car extends Vehicle{
	private int loader;

	public Car(int wheels, double weight, int loader) {
		super(wheels, weight);
		this.loader = loader;
	}
	
	public void printInfo(){
		super.printInfo();
		System.out.println("loader = "+loader);
	}
}
