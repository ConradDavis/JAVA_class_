/**
  * @(#)fish.FishPool.java  2008-7-31  
  * Copy Right Information	: Tarena
  * Project					: fish
  * JDK version used		: jdk1.6.4
  * Comments				: ���
  * Version					: 1.0
  * Sr	Date		Modified By		Why & What is modified
  * 1.	2008-7-31 	С��     		�½�
  * 2.	2008-8-1	С��				���ƴ��࣬������ı߽紦�����Ϸbug������
  **/
package fish;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

import main.BigMouthFishFrame;

import tools.FishUtilities;
import tools.RandomUtil;

 /**
 * ����ࡣ<br>
 * �����С��ŵ�������У���������ÿ��10��С���ʱ�����size��1���ٶȼ�2��<br>
 * ÿ��С��Ĭ�ϴ��ڵ�ʱ����15���ӡ�10����Զ���ʧ��<br>
 * ������ϰif��for��Timer���ڲ���ȵ�ʹ�á�<br>
 * ����Ҫ���ǣ�ϣ��ѧԱ���������Ϸʱ���������Ͻ����߼����Ǻ��ٶ��֡�<br>
 * �ѵ㣺����������ر߽�Ĵ�������������ʱ���������Ĵ���<br>
 * 2008-7-31
 * @author		���ڿƼ�[Tarena Training Group]
 * @version	1.0
 * @since		JDK1.6(����) 
 * @author		Administrator
 */
public class FishPool extends JLabel{
	
	private BigMouthFish fish = null;
	private FishBean bean = null;
	
	
	/** С����ڵ�ʱ�䳤�̣���λ������ */
	private int timeLegth = 20*1000;
	/** �ػ�ʱ�䳤�̣���λ������ */
	public static int reTime = 100;
	
	
	/** ����ػ涨ʱ�� */
	private Timer timer = null;
	/** С�����ɶ�ʱ�� */
	private Timer time = null;
	
	/** ������ÿ����1���������ӣ���С��1 */
	private int sizeAdd = 1;
	/** ������ÿ����1���������ӣ��ٶȼ�2 */
	private int speedAdd = 2;
	/** ������ÿ��1��С���������ӣ�������1 */
	private int scoreAdd = 1;
	
	/** ���������ڵķ��� */
	private int score = 0;
	/** �������������ٶȣ�ÿ��10��С������1�� */
	private int upgradeNum = 10;
	/** �������ѳ�С���������ÿ��upgradeNum������Ϊ0 */
	private int eatNum = 0;	
	
	/** �������ˮƽ��С�߽� */
	private int min_x = 0;
	/** �������ˮƽ���߽� */
	private int max_x = 0;
	/** ������Ĵ�ֱ��С�߽� */
	private int min_y = 0;
	/** ������Ĵ�ֱ���߽� */
	private int max_y = 0;
	
	public FishPool() {
		setSize(BigMouthFishFrame.width,BigMouthFishFrame.height);
		setLocation(10, 10);
		
		fish = new BigMouthFish();
		initFishBean();
		
		//�˴���3����3��Ϊ�˴����㲻ֱ�ӽӴ���ر߽硣
		min_x = 3;
		max_x = BigMouthFishFrame.width-fish.size-3;
		min_y = 3;
		max_y = BigMouthFishFrame.height-fish.size-3;
		
		//ע�����ϼ�
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP,0),"UpPress");
		getActionMap().put("UpPress", new UpListenerImpl());
		//ע�����Ҽ�
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,0),"RightPress");
		getActionMap().put("RightPress", new RightListenerImpl());
		//ע�����½�
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN,0),"DownPress");
		getActionMap().put("DownPress", new DownListenerImpl());
		//ע�������
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0),"LeftPress");
		getActionMap().put("LeftPress", new LeftListenerImpl());
		
		timer = new Timer(reTime,new TimerListenerImpl());
		timer.start();
		
		time = new Timer(timeLegth-FishBean.flickerTime*FishBean.filckerNum,new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//��ֹͣ����ʱ����
				time.stop();
				//����С�����˸��ʱ����
				bean.runTimer();
				//���С���Ƿ��Ѿ���˸��ϡ�
				new Thread(){
					public void run() {
						while (true) {
							//С����˸��Ϻ��ƶ������㡣
							//������������ʱ����
							if(!bean.timerIsRunning()){
								beanNewPos();
								time.restart();
								break;
							}
						}
					}
				}.start();
			}
		});
		time.start();
	}

	/**
	 * ��ʼ��С�㡣<br>
	 * ��֤С�����ɵ�λ����������λ�ò��ص���
	 */
	private void initFishBean(){
		int size = 15;
		int posx = 0;
		int posy = 0;
		do{
			posx = RandomUtil.randomInt(BigMouthFishFrame.width-size);
			posy = RandomUtil.randomInt(BigMouthFishFrame.height-size);
			//System.out.println("posx:"+posx);
			//System.out.println("posy:"+posy);
		}while (posx>=fish.posx && posx<=fish.posx+fish.size && posy>=fish.posy && posy<=fish.posy+fish.size &&
				posx+size>=fish.posx && posx+size<=fish.posx+fish.size && posy+size>=fish.posy && posy+size<=fish.posy+fish.size);
		bean = new FishBean(posx,posy,size,Color.BLUE,getBackground());
	}
	
	/**
	 * С������������λ�á�<br>
	 * ��֤С�����ɵ�λ����������λ�ò��ص���
	 */
	private void beanNewPos(){
		int size = 15;
		int posx = 0;
		int posy = 0;
		do{
			posx = RandomUtil.randomInt(2*size, BigMouthFishFrame.width-2*size);
			posy = RandomUtil.randomInt(2*size,BigMouthFishFrame.height-2*size);
		}while (posx>=fish.posx && posx<=fish.posx+fish.size && posy>=fish.posy && posy<=fish.posy+fish.size &&
				posx+size>=fish.posx && posx+size<=fish.posx+fish.size && posy+size>=fish.posy && posy+size<=fish.posy+fish.size);
		bean.newPos(posx, posy);
	}
	
	/**
	 * ����JLabel��paint�¼���
	 * @param g ���ʡ�
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		fish.paint(g);
		bean.paint(g);
	}
	/**
	 * ��������ƶ���<br>
	 * ���ݴ�������ķ����ж����Ƿ�����ر߽硣<br>
	 * @param direction �������ƶ��ķ���
	 */
	private void bigFishMove(int direction){
		MOVE:
		for(int i=0;i<fish.speed;i++){
			fish.changeDir(direction);
			//�����㵽�رߣ��������ƶ�
			switch(direction){
			case 0:
				if(fish.posy>=min_y+1)
					if(isTouched()) break MOVE;
				break;
			case 1:
				if(fish.posx<=max_x-1)
					if(isTouched()) break MOVE;
				break;
			case 2:
				if(fish.posy<=max_y-1)
					if(isTouched()) break MOVE;
				break;
			case 3:
				if(fish.posx>=min_x+1)
					if(isTouched()) break MOVE;
				break;
			}
		}
	}
	/**
	 * ���������Ƿ�Ե���С�㡣
	 * @return �Ե�С�����������С�㡣
	 */
	private boolean isTouched(){
		fish.move();
		boolean b = FishUtilities.isInteraction(fish, bean);
		if(b){
			//�������
			eatNum++;
			score += scoreAdd;
			BigMouthFishFrame.lblScore.setText(score+"");
			if(eatNum==upgradeNum){
				eatNum = 0;
				fish.size += sizeAdd;
				fish.speed += speedAdd;
				
				BigMouthFishFrame.lblSize.setText(fish.size+"");
				BigMouthFishFrame.lblSpeed.setText(fish.speed+"");
				
				//�������δ����Ƿ�����Ϸbug�����ӵĴ���
				//bug���������������ر߽紦ǡ����������ʹ����硣
				if(fish.posx==max_x || fish.posy==max_y){
					fish.posx -= sizeAdd;
					fish.posy -= sizeAdd;
				}
			}
			//�������δ����Ƿ�����Ϸbug�����ӵĴ��롣
			//bug�������������С����˸ʱ�Ե�С�㡣С�㽫������λ�ã����ֽ�ʹС�������˸��
			//ֹͣС����˸�Ķ�ʱ����������ɫΪԭ������ɫ���Ѿ���˸����Ϊ0��
			if(bean.timerIsRunning()){
				bean.stopTimer();
			}
			
			beanNewPos();
			time.restart();	
		}
		return b;
	}
	
	/**
	 * �ڲ��� - ���ϰ����¼���
	 * 2008-7-31
	 * @author		���ڿƼ�[Tarena Training Group]
	 * @version	1.0
	 * @since		JDK1.6(����) 
	 * @author		Administrator
	 */
	private class UpListenerImpl extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			bigFishMove(0);
		}
	}
	
	/**
	 * �ڲ��� - ���Ұ����¼���
	 * 2008-7-31
	 * @author		���ڿƼ�[Tarena Training Group]
	 * @version	1.0
	 * @since		JDK1.6(����) 
	 * @author		Administrator
	 */
	private class RightListenerImpl extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			bigFishMove(1);
		}
	}
	
	/**
	 * �ڲ��� - ���°����¼���
	 * 2008-7-31
	 * @author		���ڿƼ�[Tarena Training Group]
	 * @version	1.0
	 * @since		JDK1.6(����) 
	 * @author		Administrator
	 */
	private class DownListenerImpl extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			bigFishMove(2);
		}
	}
	
	/**
	 * �ڲ��� - ���󰴼��¼���
	 * 2008-7-31
	 * @author		���ڿƼ�[Tarena Training Group]
	 * @version	1.0
	 * @since		JDK1.6(����) 
	 * @author		Administrator
	 */
	private class LeftListenerImpl extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			bigFishMove(3);
		}
	}
	
	/**
	 * �ڲ��� - ͼ���ػ��¼�.<br>
	 * 2008-7-31
	 * @author		���ڿƼ�[Tarena Training Group]
	 * @version	1.0
	 * @since		JDK1.6(����) 
	 * @author		Administrator
	 */
	private class TimerListenerImpl implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
