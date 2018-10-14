package $009week5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class  PicturePanel  extends JPanel{
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawRect(5, 5, 80, 30);
	g.setColor(Color.red );
	g.fillRect(50,50,300,50);
	g.drawArc(5, 6, 5, 8, 3, 7);
	
}
	
}
