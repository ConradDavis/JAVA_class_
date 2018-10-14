package shu.hcc.snake;

import java.util.Random;
import java.util.Vector;

import shu.hcc.snake.Coordination;
import shu.hcc.snake.Snake;

public class Food {
	//食物地点表
	private Vector<Coordination> _foodList;
	//蛇地点表
	private Vector<Coordination> _snakeList;
	//食物大小
	public static final int FOOD_WIDTH = 10;
	public static final int FOOD_HEIGHT = 10;
	
	public Food(Snake snake)
	{
		_foodList = new Vector<Coordination>() ;
		_InitFoodLocation(snake);
	}
	public void _InitFoodLocation(Snake snake)
	{
		_snakeList = snake._GetSnakeList();
		boolean Flag_While = true;
		boolean Flag_For = true;
		Random _random = new Random();

		while(Flag_While){	
			Flag_For = true;
			_foodList.add(new Coordination(_random.nextInt(40),_random.nextInt(40)));
			for(int i=0;i<_snakeList.size();++i)
			{
				if(_foodList.get(0)._CrashBool(_snakeList.get(i)))
				{
					Flag_For = false;
					_foodList.remove(0);
					break;
				}
			}
			if(Flag_For)
				Flag_While = false;
		}
	}
	/*
	 * 接口
	 */
	
	public Vector<Coordination> _GetFoodList()
	{
		return _foodList;
	}
	public void _SetFoodList( Vector<Coordination>  T)
	{
		this._foodList = T;
	}
	
}