package $006;

public class A {
	int a;
	public A() {
		a=1;
	}
	public void add(int m,A n) {
		m++;
		n.a++;
	}
	public static void main(String[] args) {
		int x = 5;
		A y = new A();
		System.out.println("����ǰ�����ͱ���x="+x);
		System.out.println("����ǰӦ�����ͱ���y.a="+y.a);
		y.add(x, y);
		System.out.println("���ú�����ͱ���x="+x);
		System.out.println("���ú�Ӧ�����ͱ���y.a="+y.a);
	}

}
