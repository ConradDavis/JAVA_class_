package c14.v2.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import c14.v1.bl.UserBL;
import c14.v1.exception.FalsePWDException;
import c14.v1.exception.NoUserException;
import c14.v2.net.Client;

public class UserView {
	private JPanel view;
	private JLabel jlUser,jlPwd,jlMsg;
	private JTextField jtfUser,jtfPwd;
	private JButton jbLogin;
	private Client client;
	public UserView() {
		layout();
		jbLogin.addActionListener(new ButtonListener());
		client = new Client();
	}
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){			
			int code = client.send(jtfUser.getText(),jtfPwd.getText());
			String msg = null;
			switch(code) {
			case 0:msg = "Welcome!";break;
			case -1:msg = "User not exist!";break;
			case -2:msg = "False password!";break;
			default:msg = "an unknown error!";break;
			}
			jlMsg.setText(msg);
		}		
	}
	class ButtonListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){			
			try {
				new UserBL()
				  .verify2(jtfUser.getText(),jtfPwd.getText());
				jlMsg.setText("Welcome!");
			} catch (NoUserException e) {
				jlMsg.setText(e.toString());
			} catch (FalsePWDException e) {
				jlMsg.setText(e.toString());
			}			
		}		
	}
	private void layout() {
		view = new JPanel();
		view.setLayout(new GridLayout(3,2));
		view.add(jlUser = new JLabel("Username:"));
		view.add(jtfUser = new JTextField());
		view.add(jlPwd = new JLabel("Password:"));
		view.add(jtfPwd = new JTextField());
		view.add(jlMsg = new JLabel(""));
		view.add(jbLogin = new JButton("login"));
	}
	public JPanel getView() {		
		return view;
	}
}
