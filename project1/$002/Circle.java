package $002;

public class Circle {
	double radius;//  ȫ�ֱ���                                       
      static  int numOfObject;//�����
	public Circle(double d) {//���캯������new��Ӧ
		// TODO Auto-generated constructor stub
		radius=d;
		numOfObject++;
		
	}
	public Circle() {//��Circle c2�������ع��캯��
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
