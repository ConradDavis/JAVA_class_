package $001;

public class Bisai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=100,max=0,sum=0,ave=0;
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*10+1);
			sum+=a[i];
			if(min>a[i])
				min=a[i];
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		ave=sum/a.length;
		System.out.println(ave);
		

	}

}
