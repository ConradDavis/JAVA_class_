package shu.hcc.control;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;


import java.lang.Thread;

import shu.hcc.control.SnakeControl;
import shu.hcc.snake.Food;
import shu.hcc.snake.Snake;
import shu.hcc.ui.SnakePaint;


public class ControlCentral {
	SnakeControl _snakeControl;
	SnakePaint _panel; 
	//游戏按键
	private JButton _aboutButton;
	private JButton _startButton;
	
	private JLabel _showLabel;
	private JButton _showScore;
	//private JLabel jtest;
	//游戏进程
	private Thread _PaintTd;
	private SnakeTd _GameTd;
	
	public ControlCentral(SnakeControl snakecontrol)
	{
					_snakeControl = snakecontrol;
					_panel = _snakeControl._Getpanel();
					
					_initButton();
					snakecontrol.jb = _showScore; 
	}
	
	/**
	 * 控制界面按键初始化
	 */
	private void _initButton()
	{
		_panel.setLayout(null);
		
		_showLabel= new JLabel();
		_showLabel.setFont(new java.awt.Font("Dialog",1,20));//字形，粗细，大小
		_showLabel.setText("得分：");
		_showLabel.setForeground(Color.BLUE);
		_showLabel.setLocation(420, 100);
		_showLabel.setBackground(new Color(240,240,240));
		_showLabel.setSize(80,60);
		_panel.add(_showLabel);
		
		_showScore= new JButton("0");
		_showScore.setSize(50,60);
		_showScore.setLocation(480, 100);
		_showScore.setBackground(new Color(240,240,240));
		_showScore.setFont(new java.awt.Font("Dialog",1,20));
		_showScore.setBorder(null);
		_showScore.setEnabled(false);
		_panel.add(_showScore);
		
		_startButton = new JButton();
		_startButton.setText("开始游戏");
		_startButton.setLocation(420, 250);
		_startButton.setSize(90, 30);
		_panel.add(_startButton);
		_startButton.addActionListener(new _StartActionListener());
		
		_aboutButton = new JButton();
		_aboutButton.setText("关于游戏");
		_aboutButton.setLocation(420,300);
		_aboutButton.setSize(90, 30);
		_panel.add(_aboutButton);
		_aboutButton.addActionListener(new _AboutActionListener());
		_panel.requestFocus();
	}
	/**
	 * 按键监听事件书写
	 * @author hecongc
	 */
	class _StartActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(!_panel._GetStart() && !_panel._GetGG())//游戏没开始 上一吧没gg
			{
				_panel._SetStart (true);
				_PaintTd =new Thread(tdpaint);
				_PaintTd.start();				
				_startButton.setText("暂停");
			}
			else if(!_panel._GetStart() && _panel._GetGG())
			{//上吧结束了，重开一句
				//成员重新
				_panel._SetSnakeListNull();
				_panel._SetFoodListNull();
				_panel._AgainBirth();
				System.out.println(	_panel._GetFood()._GetFoodList().get(	_panel._GetFood()._GetFoodList().size()-1)._x+"||||HCC"+	_panel._GetFood()._GetFoodList().get(	_panel._GetFood()._GetFoodList().size()-1)._y);
				_panel._SetStart (true);
				System.out.println(	_panel._GetFood()._GetFoodList().get(	_panel._GetFood()._GetFoodList().size()-1)._x+"||||"+	_panel._GetFood()._GetFoodList().get(	_panel._GetFood()._GetFoodList().size()-1)._y);
				_PaintTd =new Thread(tdpaint); 
				_PaintTd.start();	
			}
			else if(!_panel._GetGG() && _panel._GetStart())
			{//游戏开始，但还没gg
				System.out.println("Please Continue....");
				if(_GameTd!=null)_GameTd.SetSuspend(true);
				 JOptionPane.showMessageDialog(_panel, "游戏正在进行！请完成……",
						 "消息提示",JOptionPane.INFORMATION_MESSAGE);
				 if(_GameTd!=null)_GameTd.SetSuspend(false);
			}
				
		}
	}
	
	class _AboutActionListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{
			if(_GameTd!=null)_GameTd.SetSuspend(true);
			JOptionPane.showMessageDialog(_panel, "本软件由何聪聪（上海大学）制作完成," +
					"如需技术支持，请至邮件h18818213756@live.comO(∩_∩)O哈哈~","帮助",JOptionPane.NO_OPTION);
			if(_GameTd!=null)_GameTd.SetSuspend(false);
		}
	}
	
	
	
	private Runnable tdpaint  = new Runnable()
	{
		public void run()
		{
			while((_panel._GetCount()>-1))
			{//while(true){//while(true)保证线程是活着的
			_snakeControl._GameCountPanel();
			}//结束之后倒计时为_isCount=-1
			//开始跑蛇
			_GameTd =new SnakeTd(){};
			 _GameTd.start();	
		}
	};
	private abstract class SnakeTd extends Thread
		{
			private boolean suspend = false;
			private String control = "";
			public void SetSuspend(boolean suspend){
				if(!suspend){
					synchronized (control){
						control.notifyAll();
					}
				}
				this.suspend = suspend;
			}
			
			public void run()
			{
				while(!_snakeControl._IsEndGame())
				{
					synchronized (control){
					if(suspend){
						try {
							control.wait();
						}catch(Exception e){
							e.printStackTrace();
							}
						}
					_snakeControl._GameRunning();
					}
					
				}
				_startButton.setText("再来一局");
				System.out.println("Over");
			}			
	}
	
	}
