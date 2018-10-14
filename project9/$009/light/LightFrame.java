package $009.light;

import javax.swing.JFrame;

public class LightFrame {
	private JFrame window;
	public LightFrame() {
		window = new JFrame("Light Application");
		window.add(new ControlPanel().getPanel());
		window.setSize(300, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	public static void main(String[] args) {
		new LightFrame();
	}

}
