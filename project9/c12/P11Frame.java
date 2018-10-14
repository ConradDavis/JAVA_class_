package c12;

import javax.swing.JFrame;

public class P11Frame {
	private JFrame frame;

	public P11Frame() {
		frame = new JFrame();
		frame.add(new P11View().getView());
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}

	public static void main(String[] args) {
		new P11Frame();
	}
}
