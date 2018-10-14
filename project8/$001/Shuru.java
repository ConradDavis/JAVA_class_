package $001;

import java.util.Scanner;

public class Shuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,max=0;
		Scanner sc= new Scanner(System.in);
		m=sc.nextInt();
		while(m!=-1) {
			if(max<m) {
				max=m;
			}
			m=sc.nextInt();
		}

		System.out.println(max);
	}

}
