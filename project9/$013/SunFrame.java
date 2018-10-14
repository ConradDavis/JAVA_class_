package $013;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class SunFrame {
	private JFrame frame;
	
	public SunFrame() {
		frame= new  JFrame("Sun   Cartoon ");
		
		frame.setLayout(new GridLayout(1,2));
		frame.add(new MainView().getView());
		frame.add(new MainView().getView());
		//SunView sunView = new SunView();
		//frame.add(sunView);
		//new Thread(sunView).start();//Æô¶¯Ïß³Ì
		//frame.add(new SunView( ));
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true );
	}
	
	public static void main(String[ ] args) {
		new SunFrame();
		

	}

}
