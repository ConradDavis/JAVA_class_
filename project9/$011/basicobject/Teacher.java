package $011.basicobject;
/*��дһ����Teacher��������ʦ�Ŀ�ʱ�����Ϳ�ʱϵ������Ϊdouble���͡����н�ʦ�Ŀ�ʱϵ����ͬ��
 * Teacher����һ����ʼ����ʱ�����Ĺ��췽����һ�������ʱ������courseCompute��������ʱ��������ʱ��*ϵ������
 * ����ֵ����Ϊdouble��
��дһ����������в��ԡ�����������ʦ���󣬿�ʱ���ֱ�Ϊ96��64����ʦ�Ŀ�ʱϵ��Ϊ1.2�������λ��ʦ�Ŀ�ʱ������
2���������е�Teacher�������һ��int�͵ľ�̬����num����ʼֵΪ0��������ͳ�ƴ�����ʦ����ĸ�����
�޸��������򣬵����������ʦ����ʱ���ܹ��ڿ���̨��ӡ���������ʦ�����������*/

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
