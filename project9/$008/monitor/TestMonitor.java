package $008.monitor;

public class TestMonitor {

	public static void main(String[] args) {
		Diamond d = new Diamond();
		Gold g = new Gold();
		
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		d.registerObserver(tiger);
		d.registerObserver(lion);
		g.registerObserver(lion);
		
		d.setKarat(10);
		g.setGram(1000);
		

	}

}
