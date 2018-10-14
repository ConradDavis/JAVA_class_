package gongcheng;

public class xiangmu0 {
	int n;
	  void  qiu( ) {
		double d=100;
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=d;
			d/=2;
			sum+=d;
		}
		System.out.println("d=   "+d+"\nsum=   "+sum);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xiangmu0 a = new xiangmu0();
		a.n=8;
		a.qiu();

	}

}
