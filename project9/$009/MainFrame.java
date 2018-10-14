package $009;

import javax.swing.JFrame;

import $009.light.ControlPanel;

public class MainFrame {//FrameÎª»­¿ò
	private JFrame window;
	
	public MainFrame() {
		window = new JFrame();
		window.setSize(400, 150);
		//window.add(new MainPanel().getPanel());//caishuzi
		window.add(new PicturePanel());//»­Í¼
		window.add(new ControlPanel().getPanel( ) );
		window.setTitle("My First Window Application!")
		;
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}

}
