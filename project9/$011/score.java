package $011;

public class score {
	int score[]=new int[30];
	public   void suiji() {
		for(int i=0;i<score.length;i++) {
			
			score[i]=(int) (Math.random()*101);
		}
		
	}
	public void max() {
		int max=0;
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}
		
		}
		
	}
	public void min() {
		int min=0;
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) {
				min=score[i];
			}
		
		}
	}
	public void zuihou() {
		double zuihou=0;
		double sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[ ]=new int[30];
		score a= new score();
		a.min( );
		a.max();
		System.out.print("min");
		
		
		
	}

}
