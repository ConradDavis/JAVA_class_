package $013;

public class Printer  extends Thread {
	private String content;

	public Printer(String content) {

		this.content = content;
	}
	public void run(){
		while(true) {
			System.out.println(content);
			
		}
		

	}

}
