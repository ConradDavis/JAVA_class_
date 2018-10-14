package c12;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PicturePanel extends JPanel {
	private int choice = 2;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		switch(choice) {
		case 0:g.drawRect(150, 100, 200, 200);//������
			   break;
		case 1:g.drawRect(100, 50, 400, 200);//����
			   break;
		case 2:g.drawOval(100, 50, 200, 200);//Բ
			   break;
		case 3:g.drawOval(50, 50, 300, 200);//��Բ		
		}		
	}
	public void setChoice(int choice) {
		this.choice = choice;
		this.repaint();
	}
	
}
