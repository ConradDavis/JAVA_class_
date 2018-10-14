package $006.duck.v3;

public class Rubber extends Duck
                 implements QuackBehavior{
	
	public void display() {
		System.out.println("I am a Rubber Duck...");
	}
	public void quack() {
		System.out.println("squeak...");
	}	
}
