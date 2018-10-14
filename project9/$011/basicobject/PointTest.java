package $011.basicobject;
/*题目：设计一个描述二维平面上点的类Point，要求如下：
（a）该类需要描述点的浮点型的横坐标x和纵坐标y。
（b）提供能够初始化横纵坐标的有参构造方法，
         要求参数名称与属性同名。
（c）计算两点间距离的方法distance。
提示：两点之间距离等于两点横纵坐标之差的平方和再开方
Math类中求平方根的方法：
static double sqrt(double  a)*/
public class PointTest {
	public static void main(String[] args) {
		 Point p1=new Point(8,9);
	     Point p2=new Point(4,5);
	     System.out.println("两个点的距离："+
	                      p1.distance(p2)); 
	}
}