package $011.inheri.f2;
/*3. ����һ�������ȱ������ε���Trival��
 * ���е����԰��������ε�bian��
 * ����������Ĭ�Ϲ��췽����Ϊbianָ����ֵ�Ĺ��췽����
 * ��ȡ���������findArea()��
 * �����÷������ǵ�֪ʶ���������������TriCylinder��
 * ������findArea()Ϊ������������ı��������
 * �����߶����Ժͼ������������ķ���.*/
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
