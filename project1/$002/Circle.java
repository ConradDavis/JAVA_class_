package $002;

public class Circle {
	double radius;//  全局变量                                       
      static  int numOfObject;//类变量
	public Circle(double d) {//构造函数，与new对应
		// TODO Auto-generated constructor stub
		radius=d;
		numOfObject++;
		
	}
	public Circle() {//由Circle c2创建重载构造函数
		// TODO Auto-generated constructor stub
		this(5);//radius=5;
		
	}
	void printPerimeter() {
		double perimeter = 2*Math.PI *radius;
		System.out.println(perimeter);
		
	}
	void  printArea() {
		double area=Math.PI *radius*radius;
		System.out.println(area);
	}
	

}
