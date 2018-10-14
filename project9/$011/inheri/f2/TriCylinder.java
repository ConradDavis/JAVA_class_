package $011.inheri.f2;

public class TriCylinder extends Trival{
	private double height;

	public TriCylinder() {
		this(1.0,1.0);
	}

	public TriCylinder(double bian,double height) {
		super(bian);
		this.height = height;
	}
	public double findArea() {
		return 2*super.findArea()
				    +3*super.getBian()*height;
	}
	public double findVolumn() {
		return super.findArea()*height;
	}
	
}
