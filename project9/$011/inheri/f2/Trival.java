package $011.inheri.f2;
/*3. 定义一个描述等边三角形的类Trival，
 * 其中的属性包括三角形的bian，
 * 方法包括：默认构造方法、为bian指定初值的构造方法、
 * 获取三角形面积findArea()。
 * 试利用方法覆盖的知识，设计三棱柱体类TriCylinder。
 * （其中findArea()为计算三棱柱体的表面积）。
 * 包含高度属性和计算面积、体积的方法.*/
public class Trival {
	private double bian;

	public Trival() {
		this(1.0);
	}
	public Trival(double bian) {
		this.bian = bian;
	}
	public double findArea() {
		return bian*bian*Math.pow(3, 0.5)/4;
	}
	public double getBian() {
		return bian;
	}
	
	

}
