package $012;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import $012.PicturePanel;
import $012.P11View.ButtonListener;

public class P11View {
	private JPanel view;
	private PicturePanel picture;
	private JButton jbSquare,jbRect,jbCircle,jbOval;
	public P11View() {
		layout();
		ButtonListener listener = new ButtonListener();
		jbSquare.addActionListener(listener);
		jbRect.addActionListener(listener);
		jbCircle.addActionListener(listener);
		jbOval.addActionListener(listener);
	}
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jbSquare) {
				picture.setChoice(0);
			}else if(e.getSource() == jbRect) {
				picture.setChoice(1);
			}else if(e.getSource() == jbCircle) {
				picture.setChoice(2);
			}else if(e.getSource() == jbOval) {
				picture.setChoice(3);
			}			
		}
		
	}
	private void layout() {
		view = new JPanel();
		view.setLayout(new BorderLayout());
		view.add("Center",picture = new PicturePanel());
		JPanel control = new JPanel();
		control.setLayout(new GridLayout(1,4));
		control.add(jbSquare = new JButton("Square"));
		control.add(jbRect = new JButton("Rectangle"));
		control.add(jbCircle = new JButton("Circle"));
		control.add(jbOval = new JButton("Oval"));
		view.add("South",control);
	}
	public JPanel getView() {
		return view;
	}
}