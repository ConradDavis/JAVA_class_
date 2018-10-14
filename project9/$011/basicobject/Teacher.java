package $011.basicobject;
/*编写一个类Teacher，描述教师的课时数量和课时系数，均为double类型。所有教师的课时系数相同。
 * Teacher类有一个初始化课时数量的构造方法，一个计算课时当量的courseCompute方法（课时当量＝课时量*系数），
 * 返回值类型为double。
编写一个测试类进行测试。创建两个教师对象，课时量分别为96和64，教师的课时系数为1.2，输出两位老师的课时当量。
2）在上题中的Teacher类中添加一个int型的静态属性num（初始值为0），用来统计创建教师对象的个数。
修改上述程序，当创建多个教师对象时，能够在控制台打印输出创建教师对象的人数。*/

public class Teacher {
	private double hour;
	private static double index;
	private static int num = 0;
	public Teacher(double hour) {
		super();
		this.hour = hour;
		num++;
	}
	public double courseCompute() {
		return hour*index;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public static double getIndex() {
		return index;
	}
	public static void setIndex(double index) {
		Teacher.index = index;
	}
	public static int getNum() {
		return num;
	}
	

}
