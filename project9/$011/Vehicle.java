package $011;

public class Vehicle {
private int wheels;
private double weight;

	public Vehicle(int wheels, double weight) {
	super();
	this.wheels = wheels;
	this.weight = weight;
}
public void print() {
	System.out.println("wheels         "+this.wheels);
	System.out.println("weight        "+this.weight);
}
public class Car extends Vehicle {
	private int loader;
	public Car(int wheels, double weight,int loader) {
		super(wheels,weight);
		this.loader = loader;
		
		
	}
	public void print() {
		System.out.println("loader         "+this.loader);
		
	}
	
	
	
	
	
}









	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
