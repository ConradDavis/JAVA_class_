package c13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SunView extends JPanel implements Runnable{
	private int y = 0;
	private long sleepingTime = 10;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(125, 400-y, 50, 50);
	}
	@Override
	public void run() {
		while(true) {
			y++;
			try {
				Thread.sleep(sleepingTime);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			this.repaint();
		}		
	}
	public long getSleepingTime() {
		return sleepingTime;
	}
	public void setSleepingTime(long sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
}
