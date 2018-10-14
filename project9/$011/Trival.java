package $011;

public class Trival {

	private double bian;
	public double getBian() {
		return bian;
	}
	public Trival() {
		this(3.0);//×Ô¼º
		//super(2.0)¸¸Àà
	}
	public Trival(double bian) {
		super();
		this.bian = bian;
	}
	public double findArea() {
		return (Math.sqrt(3)/4)*Math.pow(bian, 2);
		//return bian*bian*Math.pow(3.0,0.5);
	}
	
	
}
