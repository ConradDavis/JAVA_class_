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
		System.out.println("调用前简单类型变量x="+x);
		System.out.println("调用前应用类型变量y.a="+y.a);
		y.add(x, y);
		System.out.println("调用后简单类型变量x="+x);
		System.out.println("调用后应用类型变量y.a="+y.a);
	}

}
