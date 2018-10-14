package shu.hcc.ui;

import shu.hcc.control.SnakeControl;
import shu.hcc.snake.Snake;
import shu.hcc.snake.Coordination;
import shu.hcc.snake.Food;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.util.Vector;



public class SnakePaint extends JPanel {
	//每个JPanel都有个id
	private static final long serialVersionUID = 1L;
	//游戏面板宽高
	private final int _panelWidth = 400;
	private final int _panelHeight = 400;
	//游戏坐标游戏间隔
	private final int _x = 10;
	private final int _y = 10;
	//游戏面积
	private final int _tileSize = 10;
	
	//游戏-蛇--成员
	private Snake _snake;
	private Vector<Coordination> _snakeList ;
	
	//游戏-食物--成员
	private Food _food;
	private Vector<Coordination> _foodList ;
	
	//游戏结束判断--成员
	private boolean _isGG;
	
	//游戏开始判断--成员
	private boolean _isStart;
	
	//游戏开始倒计时值--成员
	private int  _isCount;
	//private JLabel _showLabel;
	
	//游戏草莓照片存储
	private BufferedImage _bufferImageStrawberry; 
	private BufferedImage _bufferImageSnakeHead; 
	private BufferedImage _bufferImageSnakeBody;
	private BufferedImage _bufferImageSnakeTrail; 
	/**
	 * 初始化函数
	 */
	public SnakePaint()
	{
		try{
		this._bufferImageStrawberry = ImageIO.read(new File("//home//hecongc//JAVA//20160914Snake//src//image//strawberry.png"));
		this._bufferImageSnakeHead = ImageIO.read(new File("//home//hecongc//JAVA//20160914Snake//src//image//snakehead.png"));
		this._bufferImageSnakeBody = ImageIO.read(new File("//home//hecongc//JAVA//20160914Snake//src//image//snakebody.png"));
		this._bufferImageSnakeTrail = ImageIO.read(new File("//home//hecongc//JAVA//20160914Snake//src//image//snaketrail.png"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		_RandomBrith();
		
	}
	
	/**
	 * 界面初始化--蛇和食物绘制
	 * 随机生成蛇或食物的坐标，但是必须保证不会重叠。。。。
	 */
	public void _RandomBrith()
	{
		this._isStart = false;
		this._isGG = false;
		this._isCount =  3; //倒计时次数
		this._snake = new Snake();
		this._food = new Food(_snake);
	}
	
	public void _AgainBirth()
	{
		this._isStart = false;
		this._isGG = false;
		this._isCount =  3; //倒计时次数
		this._snake._InitSnake();
		this._food._InitFoodLocation(this._snake);
	}

	//因为在所有组件还没画出时,是不能获得Graphics的,只会返回空.
	//只有在JFrame全部显示后才能get到Graphics,所以必须用事件调用画板画其他的
	//但是可以调用画板将图像画出来的，这就相当于初始化了
	//不知道可以不可以用update进行更新
	/**
	 * 所以paintComponent就是本身这个容器自己画出自己组件的方法了。如果只是为了改变本身这个容器中的组件，只需要改写paintComponent方法就可以了，如果还要保留容器中的原本组件就别忘了调用super.paintComponent(g)。如果要改写paint方法来改变本身这个容器的组件，那么也别忘了要调用super.paint(g)，不然出来的东西是不包含原组件、原边框和子组件的。
	 */
	@Override
	public void paintComponent(Graphics pen)//super.paintComponent(g)是父类JPanel里的方法,会把整个面板用背景色重画一遍,起到清屏的作用
	{
		
		try{
			super.paintComponents(pen);
			_CreatGameInit(pen);
			if(_isGG)
			{//游戏是否结束？
				_GameOverDisplay(pen);
			}		
			if(_isStart)
			{ //游戏是否开始？
				_CreateSnake(pen);
				_CreateFood(pen);
				//倒计时
				if(_isCount > -1)
					{_CreateTip(pen);}
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		this.requestFocus();
		
	}
	
	private void _CreatGameInit(Graphics pen)
	{
		pen.setColor(Color.BLACK);
		pen.drawRect(_x, _y, _panelWidth, _panelHeight);
		
		pen.setColor(Color.WHITE);
		pen.fillRect(_x+1, _y+1, _panelWidth-1, _panelHeight-1);
		
		pen.setColor(Color.GRAY);
		for(int i=1;i<this._panelWidth/this._tileSize;++i)
		{
			pen.drawLine(this._x+i*_tileSize, this._y, this._x+i*_tileSize, this._y+this._panelHeight);
		}
		for(int i=1;i<this._panelHeight/this._tileSize;++i)
		{
			pen.drawLine(this._x, this._y+i*this._tileSize, this._x+this._panelWidth, this._y+i*this._tileSize);
		}
	}
	private void _CreateSnake(Graphics pen)
	{
		_snakeList = _snake._GetSnakeList();
		if(_snakeList == null)
		{
			return;
		}

		for(int i=0;i<_snakeList.size();++i)
		{
			if(!_snakeList.get(i)._CrashLine()){
				if(i == _snakeList.size()-1){
						 _SnakePaint(_bufferImageSnakeHead,pen,this._x+(_snakeList.get(i)._x)*_tileSize,this._y+(_snakeList.get(i)._y)*_tileSize,this._x+(_snakeList.get(i)._x+1)*_tileSize,this._y+(_snakeList.get(i)._y+1)*_tileSize,_snake._GetNextDirection());
					}
				else if(i == 0){		
					 _SnakePaint(_bufferImageSnakeTrail,pen,this._x+(_snakeList.get(i)._x)*_tileSize,this._y+(_snakeList.get(i)._y)*_tileSize,this._x+(_snakeList.get(i)._x+1)*_tileSize,this._y+(_snakeList.get(i)._y+1)*_tileSize,TailDirection(_snakeList.get(0),_snakeList.get(1)));
				//	pen.fillRect(this._x+_snakeList.get(i)._x*_tileSize ,this._y+_snakeList.get(i)._y*_tileSize ,Snake.SNAKE_WIDTH/2 , Snake.SNAKE_HEIGHT/2);
											}
				else{
					pen.drawImage(_bufferImageSnakeBody,this._x+(_snakeList.get(i)._x)*_tileSize ,this._y+(_snakeList.get(i)._y)*_tileSize , this._x+(_snakeList.get(i)._x+1)*_tileSize ,this._y+(_snakeList.get(i)._y+1)*_tileSize,10,10, 20,20,this);
					}
			}
		}
	}
	final Dimension step[]={new Dimension(0,-1),new Dimension(0,1),new Dimension(-1,0),new Dimension(1,0)};
	private void _SnakePaint(BufferedImage image,Graphics pen,int dx1,int dy1,int dx2,int dy2,int dir)
	{	
		pen.drawImage(image,dx1,dy1 ,dx2 ,dy2,coo(dir,10).width,coo(dir,10).height, coo(dir,20).width,coo(dir,20).height,this);
	}
	private Dimension coo(int dir,int x)
	{
		return new Dimension(step[dir].width*10+x,step[dir].height *10 +x);
	}
	private int TailDirection(Coordination a,Coordination b)
	{
		 	return a._TailDirection(b);
	}
	
	private void _CreateFood(Graphics pen)
	{
		_foodList = _food._GetFoodList();
		if(_foodList == null)
		{
			return;
		}
		pen.setColor(Color.BLACK);
		for(int i=0;i<_foodList.size();++i)
		{
			pen.drawImage(_bufferImageStrawberry,this._x+(_foodList.get(i)._x-1)*_tileSize, this._y+(_foodList.get(i)._y-1)*_tileSize,this);
			/*
			pen.setColor(Color.PINK);
			pen.fillRect(this._x+_foodList.get(i)._x*_tileSize, this._y+_foodList.get(i)._y*_tileSize, Food.FOOD_WIDTH, Food.FOOD_HEIGHT);
		*/
		}
	}
	
	private void _CreateTip(Graphics pen)
	{
        pen.setColor(Color.BLUE);  
        String show;
        if(_isCount > 0)
        	{//游戏开始
        	//显示计数
        		pen.setFont(new Font("Dialog", Font.BOLD, 100));  
        		show = new String(String.valueOf(_isCount));
        	}
        else 
        	{
        	//显示开始
        		pen.setFont(new Font("Dialog", Font.BOLD, 64));  
        		show = new String("开始");
        	}
        pen.drawString(show,150,225); 
	}
	
	private void _GameOverDisplay (Graphics pen)
	{
        Font font = new Font("宋体", Font.BOLD, 64);  
        pen.setFont(font);  
        pen.setColor(Color.RED);  
        pen.drawString("游戏结束",60,100);
	}
	/**
	 * 蛇和食物的外用接口
	 * @return
	 */
	public Snake _GetSnake()
	{
		return _snake;
	}
	public void _SetSnakeListNull()
	{
		int snakesize = this._GetSnake()._GetSnakeList().size();
		for(int i=0;i<snakesize;++i){
			this._GetSnake()._GetSnakeList().remove(this._GetSnake()._GetSnakeList().size()-1);
		}
	}
	public Food _GetFood()
	{
		return _food;
	}
	public void _SetFoodListNull()
	{
			this._foodList.remove(0);
	}
	public boolean _GetGG()
	{
		return this._isGG;
	}
	public void _SetGG(boolean T)
	{
		 this._isGG = T;
	}
	public boolean _GetStart()
	{
		return this._isStart;
	}
	public void _SetStart(boolean T)
	{
		this._isStart = T;
	}
	
	public int  _GetCount()
	{
		return this._isCount;
	}
	
	public void _SetCount(int c)
	{
		this._isCount = c;
	}
	public void _DeCount()
	{
		--this._isCount ;
		if(this._isCount < 0 )
			this._isCount = -1;
	}
    /** 
     * 安装玩家控制器 
     * @param control 
    */   
    public void setGameControl(SnakeControl control){  
        this.addKeyListener(control);  
    }  
  
}


