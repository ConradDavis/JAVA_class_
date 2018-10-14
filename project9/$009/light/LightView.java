package $009.light;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LightView extends JPanel {
	private Light light;
	public LightView(Light light) {
		this.light = light;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(light.isOn()) {
			g.setColor(Color.red);
		}else {
			g.setColor(Color.BLACK);
		}
		g.fillOval(5, 5, 100, 100);
	}
	public void update() {
		this.repaint();		
	}
}
