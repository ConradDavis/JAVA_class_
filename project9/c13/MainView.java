package c13;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainView {
	private JPanel view;
	private SunView sunView;
	private JButton jbAdd,jbSub;
	public MainView() {
		layout();
		BL bl = new BL();
		jbAdd.addActionListener(bl);
		jbSub.addActionListener(bl);
	}
	private void layout() {
		view = new JPanel();
		sunView = new SunView();
		view.setLayout(new BorderLayout());
		view.add("Center",sunView);
		new Thread(sunView).start();
		
		JPanel ctrlPanel = new JPanel();
		ctrlPanel.setLayout(new GridLayout(1,2));
		ctrlPanel.add(jbAdd = new JButton("+"));
		ctrlPanel.add(jbSub = new JButton("-"));
		view.add("South",ctrlPanel);
	}
	class BL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == jbAdd) {
				sunView.setSleepingTime(
						sunView.getSleepingTime()-5);
			}else {
				sunView.setSleepingTime(
						sunView.getSleepingTime()+10);
			}
		}		
	}
	public JPanel getView() {
		return view;
	}
	
}
