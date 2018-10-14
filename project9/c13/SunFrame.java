package c13;

import javax.swing.JFrame;
public class SunFrame {
	private JFrame frame;

	public SunFrame() {
		frame = new JFrame("Sun Cartoon");		
		frame.add(new MainView().getView());		
		frame.setSize(300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new SunFrame();
	}
}