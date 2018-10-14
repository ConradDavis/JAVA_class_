package $006.duck.v3;

public class Mallard extends Duck implements
                    FlyBehavior,QuackBehavior{
	
	public void display() {
		System.out.println("I am a Mallard...");
	}

	@Override
	public void quack() {
		System.out.println("quacking...");
		
	}

	@Override
	public void fly() {
		System.out.println("flying...");
		
	}
	
}
