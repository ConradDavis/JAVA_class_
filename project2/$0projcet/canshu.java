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
	 System.out.println(" ����ǰ�����ͱ���x= "+x);
	 System.out.println(" ����ǰ�������ͱ���y������ "+y.a);
	 y.add(x, y);
	 System.out.println(" ����ǰ�����ͱ���x= "+x);
	 System.out.println(" ����ǰ�������ͱ���y������ "+y.a);
}
}

	 
	


