package $011.basicobject;
/*��Ŀ�����һ��������άƽ���ϵ����Point��Ҫ�����£�
��a��������Ҫ������ĸ����͵ĺ�����x��������y��
��b���ṩ�ܹ���ʼ������������вι��췽����
         Ҫ���������������ͬ����
��c��������������ķ���distance��
��ʾ������֮�������������������֮���ƽ�����ٿ���
Math������ƽ�����ķ�����
static double sqrt(double  a)*/
public class PointTest {
	public static void main(String[] args) {
		 Point p1=new Point(8,9);
	     Point p2=new Point(4,5);
	     System.out.println("������ľ��룺"+
	                      p1.distance(p2)); 
	}
}