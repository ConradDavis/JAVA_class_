package $013;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SunView extends JPanel implements Runnable{
	private int y=0,x=0;
	private  long sleepingTime= 10;
	private boolean Up=true,Down=false;
	private boolean Left=true;
	public void paintComponent (Graphics  g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(125-x, 400-y, 50, 50);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(Up)
			y++;
			else if(Down)
			y--;
			else if(Left)
				x++;
			else
				x--;
			try {
				Thread.sleep(sleepingTime);//ясЁы
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace( );
			}
			this.repaint();
		}
	}



	public long getSleepingTime() {
		return sleepingTime;
	}

	public void setUp(boolean up) {
		this.Up = up;
	}

	public void setSleepingTime(long sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
	

}
