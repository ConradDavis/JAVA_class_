package $011;   
public class Point {    
private double x,y;   

public Point(double x, double y) {   
	super();
	this.x = x;  
	this.y = y;   
}
public double distance(Point p2) {
	return Math.sqrt(Math.pow( this.x-p2.x,2)+Math.pow( this.y-p2.y,2));
	
}

public static void main(String[] args) {
	//Point c=new Point("x","y",2.0,3.0);
	
}


}
