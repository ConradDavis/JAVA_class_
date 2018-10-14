/**
  * @(#)fish.FishBean.java  2008-7-31  
  * Copy Right Information	: Tarena
  * Project					: fish
  * JDK version used		: jdk1.6.4
  * Comments				: ������
  * Version					: 1.0
  * Sr	Date		Modified By		Why & What is modified
  * 1.	2008-7-31 	С��     		�½�
  **/
package fish;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

 /**
 * ������
 * 2008-7-31
 * @author		���ڿƼ�[Tarena Training Group]
 * @version	1.0
 * @since		JDK1.6(����) 
 * @author		Administrator
 */
public class FishBean implements ActionListener{

	/** С���λ��x */
	public int posx = 190;
	/** С���λ��y */
	public int posy = 190;
	/** С��Ĵ�С����sizeΪ�뾶������(Բ)�� */
	public int size = 10;
	/** С��ĵ�ǰ��ɫ */
	private Color color = Color.MAGENTA;
	
	/** С�������ɫ */
	private Color newColor = Color.MAGENTA;
	/** С��ľ���ɫ */
	private Color oldColor = Color.GRAY;
	
	/** С����ʧʱ����˸ʱ�� */
	public static int flickerTime = 350;
	/** С����ʧʱ����˸���� */
	public static int filckerNum = 8;
	private int hasFileckedNum = 0;
	/** С����ʧʱ��˸�Ķ�ʱ�� */
	private Timer timer = null;
	
	/**
	 * ȱʡ���캯������λ��(40,40)����С15����ɫColor.MAGENTA����һ��������
	 */
	public FishBean() {
		this(190,190,10,Color.MAGENTA,Color.GRAY);
	}
	
	/**
	 * ����λ�á���С����ɫ����һ�������ࡣ
	 * @param posx ������ˮƽ����x��
	 * @param posy �����Ĵ�ֱ����y��
	 * @param size �����Ĵ�С��
	 * @param newColor ��������ɫ��
	 * @param oldColor �����ľ���ɫ
	 */
	public FishBean(int posx,int posy,int size,Color newColor,Color oldColor) {
		this.posx = posx;
		this.posy = posy;
		this.size = size;
		this.newColor = newColor;
		this.oldColor = oldColor;
		this.color = newColor;
		timer = new Timer(flickerTime,this);
	}
	
	/**
	 * �ƶ��������µ�λ�á�
	 * @param posx ��������ˮƽ����x��
	 * @param posy �������´�ֱ����y��
	 */
	public void newPos(int posx,int posy){
		this.posx = posx;
		this.posy = posy;
	}
	
	/**
	 * ���ƶ�����
	 * @param g ����
	 */
	public void paint(Graphics g){
		Color c = g.getColor();
		g.setColor(color);
		g.fillOval(posx, posy, size, size);
		g.setColor(c);
	}
	
	/**
	 * ֹͣTimer��
	 */
	public void stopTimer(){
		color = newColor;
		timer.stop();
		hasFileckedNum = 0;
	}
	
	/**
	 * ����Timer��
	 */
	public void runTimer(){
		timer.start();
	}
	
	/**
	 * ��ʱ���¼���
	 */
	public void actionPerformed(ActionEvent e) {
		hasFileckedNum++;
		if(color.equals(newColor) || color==newColor)
			color = oldColor;
		else
			color = newColor;
		//��ʱ�����еĴ������ʱ��ֹͣ��ʱ����
		if(hasFileckedNum==filckerNum && timer.isRunning()){
			stopTimer();
		}
	}
	
	/**
	 * Timer��ʱ���Ƿ������С�
	 * @return ����Timer�Ƿ������С�
	 */
	public boolean timerIsRunning(){
		return timer.isRunning();
	}
}
