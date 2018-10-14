package cn.wxf.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import cn.wxf.util.GameUtil;



public class Planet extends Star {

	//除了图片，坐标。 行星沿着某个椭圆运行：长轴、短轴、速度、角度。 绕着某个Star飞。
	private double longAxis;  //椭圆的长轴
	private double shortAxis;  //椭圆的短轴
	private double speed;     //飞行的速度
	private double degree;    
	private Star center;
	
	private boolean satellite;
	
	public Planet() {
		super();
	}
	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}
	
	public Planet(Star center,String imgpath, double longAxis,
			double shortAxis, double speed) {
		super(GameUtil.getImage(imgpath));		
		
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);

	}
	
	public Planet(Star center,String imgpath, double longAxis,
			double shortAxis, double speed,boolean satellite) {
		this(center, imgpath, longAxis, shortAxis, speed);
		this.satellite = satellite;		
	}
	
	public void draw(Graphics g){
		//绘制图形
		super.draw(g);
		//下次移动的坐标和角度
		move();
		//行星绘制椭圆轨道，卫星不绘制椭圆轨道
		if(!satellite){
			drawTrace(g);
		}
	}
	public void move(){
		//沿着椭圆轨迹飞行
		x = (center.x+center.width/2) + longAxis*Math.cos(degree);
		y = (center.y+center.height/2)+ shortAxis*Math.sin(degree);		
		degree += speed;
	}
	
	public void drawTrace(Graphics g){
		double ovalX,ovalY,ovalWidth,ovalHeight;		
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = (center.x+center.width/2)-longAxis;
		ovalY = (center.y+center.height/2)-shortAxis;
		
		Color c =g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}	
	
}
