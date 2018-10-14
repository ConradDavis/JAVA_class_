package $0projcet;

public class canshu {
	int a;

public canshu() {
	a=1;
}
public void add(int m,canshu n) {
	m++;
	n.a++;
}

public static void main(String[] args) {

	 int x=5;
	canshu y=new canshu();
	 System.out.println(" 调用前简单类型变量x= "+x);
	 System.out.println(" 调用前引用类型变量y的属性 "+y.a);
	 y.add(x, y);
	 System.out.println(" 调用前简单类型变量x= "+x);
	 System.out.println(" 调用前引用类型变量y的属性 "+y.a);
}
}

	 
	


