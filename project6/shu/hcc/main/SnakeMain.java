package shu.hcc.main;

import shu.hcc.ui.*;
import shu.hcc.control.*;



public class SnakeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("20160911");
		SnakeFrame myframe = new SnakeFrame();
		SnakePaint mypanel = new SnakePaint();
		
		SnakeControl mycontrol = new SnakeControl(mypanel);
		
		/**
		 * 给你的画布注册事件监听器:
			this.canvas.addKeyListener(this);//这是要加入的,
			this.addKeyListener(this); 原因是因为,当你点击窗口内后,焦点就被 canvas 捕获了,
			如果 canvas 没有注册键盘事件监听器,它当然不能对键盘的事件作出反应.
		 */
		mypanel.setGameControl(mycontrol);
		ControlCentral mycentre = new ControlCentral(mycontrol);
		
		myframe.setContentPane(mypanel);//panel必须有个frame

	}

}
