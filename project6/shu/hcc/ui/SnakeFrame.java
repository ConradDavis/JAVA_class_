package shu.hcc.ui;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;


public class SnakeFrame extends JFrame {

	//每个Frame都有个id
	private static final long serialVersionUID = 1L;
	//Frame窗口大小
	private final int _windowWidth = 530;
	private final int _windowHeight = 450;

	public SnakeFrame()
	{
		
		this.setTitle("贪吃蛇初稿1.0");
		this.setSize(_windowWidth, _windowHeight);
		Toolkit _toolKit = Toolkit.getDefaultToolkit();
		Dimension _screenSize = _toolKit.getScreenSize();
		final int _screenWidth = _screenSize.width;
		final int _screenHeight = _screenSize.height;
		//居中
		this.setLocation((_screenWidth-this.getWidth())/2,(_screenHeight-this.getHeight())/2);
		//默认无关闭操作
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
		
		//设为窗口不变，默认可拉伸啥的
		this.setResizable(false);
		
		//设为可见,默认不可见
		this.setVisible(true);
		//
		this.setLayout(null);
	}
	
}
