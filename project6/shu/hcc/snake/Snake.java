package shu.hcc.snake;


import java.awt.Dimension;
import java.util.Random;
import java.util.Vector;

import shu.hcc.snake.Coordination;;

public class Snake {
	//蛇大小
	public static final int SNAKE_WIDTH = 10;
	public static final int SNAKE_HEIGHT = 10;
	

	//蛇的地点表
	Vector<Coordination> _snakeList = new Vector<Coordination>();
	
	//蛇的下一个方向 
	private int _nextDirection ;
	
	//方向表
	public static class Dir 
	{
		public final static int UP = 0;
		public final static int DOWN = 1;
		public final static int LEFT = 2;
		public final static int RIGHT =3 ;		
	}
	
	/*
	 * 初始化蛇
	 */
	public Snake()
	{
		_InitSnake();
	}
	public  void _InitSnake()
	{
		Random _random = new Random();
		_nextDirection = _random.nextInt(3);
		Dimension step[]={new Dimension(0,-1),new Dimension(0,1),new Dimension(-1,0),new Dimension(1,0)};
		Dimension aa;
		do{
		aa = new Dimension(_random.nextInt(40),_random.nextInt(40));
		}while(aa.height<8 ||aa.height >32 || aa.width<8 || aa.width >32);
		for (int i= 0;i<5; ++i)
		{
			_snakeList.add(new Coordination(aa.width+step[_nextDirection].width * i,aa.height +step[_nextDirection].height * i));
		}
	}
	/*
	 * 接口
	 */
	
	public Vector<Coordination> _GetSnakeList()
	{
		return _snakeList;
	}
	public void _SetSnakeList( Vector<Coordination>  T)
	{
		this._snakeList = T;
	}
	
	public int _GetNextDirection()
	{
		return _nextDirection;
	}
	public void  _SetNextDirection(int dir)
	{
		_nextDirection = dir;
	}
	
}
