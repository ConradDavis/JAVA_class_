package $009.light;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel {
	private JPanel panel;
	private JButton jbTurnOn,jbTurnOff;
	private LightView lightView;	
	private Light light;

	public ControlPanel() {
		panel = new JPanel();
		layout();
		SwitchListener sListener = new SwitchListener();
		jbTurnOn.addActionListener(sListener);
		jbTurnOff.addActionListener(sListener);
	}
	class SwitchListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jbTurnOn) {
				light.setOn(true);
			}else {
				light.setOn(false);
			}
		}		
	}
	private void layout() {
		panel.setLayout(new BorderLayout());
		light = new Light();
		lightView = new LightView(light);
		light.register(lightView);//1
		panel.add("Center",lightView);
		
		JPanel ctrlPanel = new JPanel();
		ctrlPanel.setLayout(new GridLayout(2,1));
		jbTurnOn = new JButton("¿ª");
		jbTurnOff = new JButton("¹Ø");
		ctrlPanel.add(jbTurnOn);
		ctrlPanel.add(jbTurnOff);
		panel.add("East",ctrlPanel);		
	}
	
	public JPanel getPanel() {
		return panel;
	}	
}