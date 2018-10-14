package $011.basicobject;

public class Point {
	private double x,y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double distance(Point p2) {
		return Math.sqrt(
				Math.pow(this.x-p2.x, 2)+
				Math.pow(this.y-p2.y, 2));
	}
	
}
