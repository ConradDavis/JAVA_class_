package $009;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PicturePanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(5, 5, 80, 30);
		g.setColor(Color.red);
		g.fillRect(5, 5, 300, 50);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 5, 30, 30);
		g.setColor(Color.GREEN);
		g.fillArc(100, 100, 400, 400, 0, 30);
		g.setColor(Color.red );
		g.fillArc(100, 100, 400, 400, 90, 30);
		g.setColor(Color.YELLOW);
		g.fillArc(100, 100, 400, 400, 180, 30);
		g.setColor(Color.BLUE);
		g.fillArc(100, 100, 400, 400, 270, 30);
		
	}
}
