package $001;

import java.util.Scanner;

public class Chengji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]=new int[3];
		int index = 0,max = 0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
			if(max<score[i]) {
				max=score[i];
				index=i;
			}
		}
		
		System.out.println(max+"  "+index);

	}

}
