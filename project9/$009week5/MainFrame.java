package $009week5;

import javax.swing.JFrame;

import $009.light.ControlPanel;

public class MainFrame {//FrameÎª»­¿ò
	private JFrame  window;
	
	public MainFrame() {
		window = new JFrame();
		window.setVisible(true);
		//window.add(new MainPanel().getPanel());//caishuzi
		window.setSize(700,400);
		//window.add(new PicturePanel( ));//»­Í¼
		window.add(new ControlPanel().getPanel( ) );
		window.setTitle("My Frist Window Application  !");
		window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		
		
	}
public static void main(String[] args) {
		new MainFrame();
		
		
	

	}

}
