package shu.hcc.snake;

public class Coordination {
	/*
	 * 蛇或食物的坐标类
	 */
		public int _x;
		public int _y;
		
		public Coordination(int x,int y)
		{
			this._x = x;
			this._y = y;
		}
		
		//碰撞判断--方法
		public boolean _CrashBool(Coordination other)
		{
		/*	if(this._x == other._x && this._y == other._y)
			{
				return true;
			}
			return false;
			*/
			return ((this._x == other._x) &&( this._y == other._y));
		}
		//出借碰撞判断--方法
		public boolean _CrashLine()
		{
		//	if((this._x<0)||(this._x>39)||(this._y<0)||(this._y>39))
		//		System.out.println(_x+" 111 "+"_y");
			return (this._x<0)||(this._x>39)||(this._y<0)||(this._y>39)? true:false;
		}
		//尾巴方向判断
		public int _TailDirection(Coordination other)
		{
			if(this._x-other._x ==0  && this._y -other._y <0)
				return 0;
			else if(this._x-other._x ==0  && this._y -other._y >0)
				return 1;
			else if(this._x-other._x  < 0  && this._y -other._y ==0)
				return 2;
			else if(this._x-other._x > 0  && this._y -other._y == 0)
					return 3;
			return 0;
		}
}