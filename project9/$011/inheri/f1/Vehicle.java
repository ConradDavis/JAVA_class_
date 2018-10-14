package $011.inheri.f1;
/*2. 编写一个Java应用程序，设计一个汽车类Vehicle，
 * 包含的属性有车轮个数wheels和车重weight。
 * 小车类Car是Vehicle的子类，
 * 其中包含的属性有载人数loader。
 * 卡车类Truck是Car类的子类，
 * 其中包含的属性有载重量payload。
 * 每个类都有构造方法和输出相关数据的方法。*/
public class Vehicle {
	private int wheels;
	private double weight;
	public Vehicle(int wheels, double weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}
	public void printInfo() {
		System.out.println("wheels = "+this.wheels);
		System.out.println("weight = "+this.weight);	
	}
}
