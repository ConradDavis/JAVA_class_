package $011.inheri.f1;
/*2. ��дһ��JavaӦ�ó������һ��������Vehicle��
 * �����������г��ָ���wheels�ͳ���weight��
 * С����Car��Vehicle�����࣬
 * ���а�����������������loader��
 * ������Truck��Car������࣬
 * ���а�����������������payload��
 * ÿ���඼�й��췽�������������ݵķ�����*/
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
