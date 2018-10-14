package shu.hcc.control;

import java.util.Vector;


import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.lang.Thread;

import javax.swing.JButton;

import shu.hcc.snake.*;
import shu.hcc.snake.Snake.Dir;
import shu.hcc.ui.*;

public class SnakeControl implements KeyListener {

	private Vector<Coordination> _snakeList;
	private Vector<Coordination> _foodList;
	
	private SnakePaint _panel;
	
	private Food _food;
	private Snake _snake;
	
	public JButton jb;
	
	final Dimension step[]={new Dimension(0,-1),new Dimension(0,1),new Dimension(-1,0),new Dimension(1,0)};

	/*
	 * 按键的下一次方向
	 */
	private int _nextDirection; 
	

	
	public SnakeControl(SnakePaint panel)
	{
	//要记住在初始化函数中赋值给自己定义的临时变量	
		this._panel = panel;//直接是引用传递
		this._snake = this._panel._GetSnake();
		this._snakeList = _snake._GetSnakeList();
	//	this._headIndex = _snakeList.size()-1;
		this._nextDirection = _snake._GetNextDirection();
		
		this._food = this._panel._GetFood();
		this._foodList = this._food._GetFoodList();
		
		jb = null;
	}
	/**
	 * 游戏由线程提供刷新
	 */
	//游戏开始界面倒计时刷新
	public void _GameCountPanel()
	{
		//开始界面倒计时应该能够暂停游戏,刷新计数
			_panel.repaint();
			_panel._DeCount();
			try {  
				Thread.sleep(1000);  
			} catch (InterruptedException e) {  
				e.printStackTrace();  
			}
			//System.out.println(_panel._GetCount());
	
	}
	public void _GameRunning()
	{	
				//开始游戏蛇开始跑动
					_Move(_nextDirection);
				try {  
					Thread.sleep(200);  
				} catch (InterruptedException e) {  
					e.printStackTrace();  
				} 	
	}
	
	
	/*
	 * 游戏移动
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:
			if(_nextDirection !=Snake.Dir.DOWN)
			{
				_nextDirection = Snake.Dir.UP;	
			}break;
		case KeyEvent.VK_DOWN:
			if(_nextDirection != Snake.Dir.UP)
			{
				_nextDirection = Snake.Dir.DOWN;
			}break;
		case KeyEvent.VK_LEFT:
			if(_nextDirection != Snake.Dir.RIGHT)
			{
				_nextDirection = Snake.Dir.LEFT;
			}break;
		case KeyEvent.VK_RIGHT:
			if(_nextDirection != Snake.Dir.LEFT)
			{
				_nextDirection = Snake.Dir.RIGHT;
			}break;
			
		}
		_snake._SetNextDirection(_nextDirection);
		System.out.println("hhcc"+_nextDirection  +"  !!!!!!!!snake!!!!!!!!!!"+_snake._GetNextDirection());
	}

	
	
	private void _Move(int dir)
	{
		if(!_IsEndGame())
		{
			this._snakeList.add(new Coordination(this._snakeList.get(_snakeList.size()-1)._x+step[dir].width,this._snakeList.get(_snakeList.size()-1)._y+step[dir].height));
			if(_IsEat())
			{
				_AfterEat();
			}
			else{
				_snakeList.remove(0);
			}
			this._panel.repaint();		
		}
	}
	
	/**
	 * 吃到食物与否
	 * @hecongc
	 */
	private boolean _IsEat()
	{
		System.out.println("hahah"+this._snakeList.size());
		return this._snakeList.get(this._snakeList.size()-1)._CrashBool(this._foodList.get(this._foodList.size()-1));	
		}
	/**
	 * 吃到食物后应该变长并且生成新的食物
	 */
	private void _AfterEat()
	{
		this._food._InitFoodLocation(this._snake);
		jb.setText(String.valueOf( _snake._GetSnakeList().size() - 5));
		this._foodList.remove(0);
		}
	
	/**
	 * 游戏结束判断
	 */
	public boolean _IsEndGame()
	{	
		if( _IsCrashBody() || _IsCrashWall())
		{
			if(_IsCrashBody())System.out.println("Body");
			if(_IsCrashWall())System.out.println("wall");
			_AfterCrashWall();
			return true;
			}
		return false ;
	}
	
	private boolean _IsCrashBody()
	{ 
		for(int i=0;i<(_snakeList.size()-1);++i)
		{
			if(this._snakeList.get(_snakeList.size()-1)._CrashBool(this._snakeList.get(i)))
			{
				return true;
			}
		}		
		return false;
	}
	private boolean _IsCrashWall()
	{
		return this._snakeList.get(_snakeList.size()-1)._CrashLine();
	}
	private void _AfterCrashWall()
	{
		_panel._SetStart(false);
		_panel._SetGG(true);
		_snakeList.remove((_snakeList.size()-1));	
			_panel.repaint();
	}
	
	/**
	 * 控制蛇接口
	 */

	//面板
	public SnakePaint _Getpanel()
	{
		return this._panel;
	}
	



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}