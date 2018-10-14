package c14.v1;

import javax.swing.JFrame;

import c14.v1.view.UserView;

public class LoginMain {
	private JFrame frame;
	public LoginMain() {
		frame = new JFrame();
		frame.add(new UserView().getView());
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LoginMain();
	}
}