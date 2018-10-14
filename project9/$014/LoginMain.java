package $014;

import javax.swing.JFrame;

import $014.view.UserView;

public class LoginMain {
	private JFrame frame;
	public LoginMain() {
		frame = new JFrame();
		frame.add(new UserView().getView());
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LoginMain();
	}
}