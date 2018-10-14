package $002;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Circle  c1 = new Circle(2.0);//c1是地址，new分配新内存（circle类型）
             //c1.radius=2.0 ;
             c1.printPerimeter();
             c1.printArea();
   
             
          Circle c2 = new Circle();
          c2.printPerimeter();
          c2.printArea();  
             
             
             
             
	}


}
