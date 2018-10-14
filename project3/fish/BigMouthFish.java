/**
  * @(#)fish.BigMouthFish.java  2008-7-31  
  * Copy Right Information	: Tarena
  * Project					: fish
  * JDK version used		: jdk1.6.4
  * Comments				: ��������
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
 * ��������<br>
 * ����̳�AcitonListener��ʵ��AcitonPerformed��������ϰActionListener����һ��ʵ�ַ���<br>
 * ���໹��ϰ��ʱ��Timer��ʹ��<br>
 * ���໹��ϰͼ����Graphics��ʹ��<br>
 * 2008-7-31
 * @author		���ڿƼ�[Tarena Training Group]
 * @version	1.0
 * @since		JDK1.6(����) 
 */
public class BigMouthFish implements ActionListener{
	
	/** ��������ķ���0-�� */
	public static int UP = 0;
	/** ��������ķ���1-�� */
	public static int RIGHT = 1;
	/** ��������ķ���2-�� */
	public static int DOWN = 2;
	/** ��������ķ���3-�� */
	public static int LEFT = 3;
	
	/** ������������С����sizeΪ�뾶��Բ */
	public int size = 50;
	/** ���������ڵķ���(����ķ���Ϊ��׼) */
	public int direction = RIGHT;
	/** �������������ɫ */
	private Color color = Color.CYAN;
	/** �������λ��x */
	public int posx = 80;
	/** �������λ��y */
	public int posy = 80;
	/** ��������ٶȣ���ÿ��ǰ�������� */
	public int speed = 4;
	/** �������۾��Ĵ�С */
	private int eyesize = size/5;
	/** �������۾���λ��x */
	private int eyeposx = posx+size/2;
	/** �������۾���λ��y */
	private int eyeposy = posy+size/5;
	/** �������۾�����ɫ */
	private Color eyecolor = Color.RED;
	/** ������������Ƕȵ�һ�� */
	private int maxMonth = 30;
	/** ������������ǵĽǶ� */
	private int monthsize = 30;
	
	/** ����������Ƿ��ſ� */
	private boolean isOpen = true;
	
	private Timer time = null;
	
	/**
	 * ������ȱʡ���캯��.<br>
	 * ����һ��λ��Ϊ(200,200)����СΪ50������Ϊ�ң���ɫΪColor.CYAN���ٶ�Ϊ10�Ĵ�����
	 */
	public BigMouthFish() {
		//this��ʹ�á�
		this(200,200,50,RIGHT,Color.CYAN,4);
	}
	
	/**
	 * ����λ�á���С��������ɫ���ٶȹ���һ�������㡣
	 * @param posx �������λ��x��
	 * @param posy �������λ��y��
	 * @param size ������Ĵ�С��
	 * @param direction ������ķ���0-�ϣ�1-�ң�2-�£�3-�󡣳������ʱ��Ĭ�ϸ�Ϊ1��
	 * @param color ���������ɫ��
	 * @param speed ��������ٶȡ�
	 */
	public BigMouthFish(int posx,int posy,int size,int direction,Color color,int speed) {
		this.posx = posx;
		this.posy = posy;
		this.size = size;
		if(direction==1 || direction==2 || direction==3 || direction==4)
			this.direction = direction;
		this.color = color;
		this.speed = speed;
		eyesize = size/7;
		initEye();
		
		time = new Timer(FishPool.reTime,this);
		time.start();
	} 
	
	/**
	 * �������ƶ���������ķ����ƶ��㡣
	 */
	public void move(){
		switch (direction) {
			case 0:
				posy--;
				break;
			case 1:
				posx++;
				break;
			case 2:
				posy++;
				break;
			case 3:
				posx--;
				break;
			default:
				break;
		}
	}
	
	/**
	 * �ı�������������ɫ��
	 * @param color ���ı�������������ɫ
	 */
	public void changeColor(Color color){
		this.color = color;
	}
	
	/**
	 * �ı������ķ���
	 * @param direction ���ı������ķ���
	 */
	public void changeDir(int direction){
		this.direction = direction;
	}
	
	/**
	 * ʹ�û��ʻ滭������.�������ͷ��һ�����ε���������������һ��СԲ���۾�<br>
	 * 1.���滭����ɫ<br>
	 * 2.���ƴ��������<br>
	 * 3.���ƴ�������۾�<br>
	 * 4.�ָ�������ɫ<br>
	 * @param g ����
	 */
	public void paint(Graphics g){
		//���滭�ʵ���ɫ
		Color c = g.getColor();
		//��������
		g.setColor(color);
		//��(posx,posy)�㿪ʼ�����ƿ�Ϊsize,��Ϊsize,��ʼ�Ƕ�Ϊ(direction%2==0?(direction+1):(direction-1))*90+monthsize������Ϊ360-2*maxMonth�Ļ���
		g.fillArc(posx, posy, size, size, (direction%2==0?(direction+1):(direction-1))*90+monthsize, 360-2*monthsize);
		//��������
		initEye();
		g.setColor(eyecolor);
		g.fillOval(eyeposx, eyeposy, eyesize, eyesize);
		//�ָ�������ɫ
		g.setColor(c);
	}
	
	/**
	 * ��������������¼�<br>
	 * �˴�ֻ������ĽǶȵı仯������������ػ档
	 * �ػ��������ʵ�֡�<br>
	 * �����ĺô�����֤��Ļ��ƺͲ����ֿ�����ʾ����߼��㵥�����������������������⣩��
	 * @param e �¼�����
	 */
	public void actionPerformed(ActionEvent e) {
		if(isOpen){
			monthsize -= 2;
			if(monthsize<=0)
				isOpen = false;
		}else{
			monthsize += 2;
			if(monthsize>=maxMonth)
				isOpen = true;
		}
	}
	
	/**
	 * ����ı�ʱ���۾��ĸı䡣
	 */
	private void initEye(){
		switch (direction) {
		case 0:
			eyeposx = posx+size/7;
			eyeposy = posy+size/2-eyesize;
			break;
		case 1:
			eyeposx = posx+size/2;
			eyeposy = posy+size/7;
			break;
		case 2:
			eyeposx = posx+size*5/7;
			eyeposy = posy+size/2;
			break;
		case 3:
			eyeposx = posx+size/2-eyesize;
			eyeposy = posy+size/7;
			break;
		default:
			break;
		}
	}
}
