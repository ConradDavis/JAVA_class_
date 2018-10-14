package cs;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * 1:按钮在Swing中是较为常见的组件，用于触发特定动作
 * Swing中提供了多种按钮，包括提交按钮，复选框，单选按钮等
 * 这些按钮都是从AbstractButton类中继承而来的
 * 
 * 2:Swing中的提交按钮组件(JButton)由JButton对象表示
 * JButton含有4种主要的构造方法
 * 参数text,icon分别代表显示文字标签和图标
 * 
 * 3:本实例使用了两种方式创建按钮，第一种是在初始化按钮时赋予按钮图标与文字
 * 这种初始化必须先获得图片路径，然后将路径实例化到Icon，然后在Button中加载出来
 * 第二种方式是首先创建一个没有定义图标和文字的按钮对象，然后使用
 * setIcon()方法为这个按钮定制一个图标。
 * setToolTipText()方法是为按钮设置提示文字，鼠标停留在按钮上面即可
 * setBorderPainted()方法设置边界是否显示
 * setMaximumSize()方法设置按钮的大小与图标的大小一致，该类方法需要的参数类型是
 *           Dimension类对象，这样看上去此图片就如同按钮一样摆放在窗体中，
 *           同时也可以使用setEnabled()方法设置按钮是否可用
 * 
 * @author biexiansheng
 *
 */
public class JButtonTest extends JFrame{


	public JButtonTest(){//定义一个构造方法
        
        Container cp= this.getContentPane();
        cp.setLayout(new GridLayout(1,4,1,1));
        //cp.setLayout(new FlowLayout(FlowLayout,LEFT,10,10));
        cp.add(new JButton ("1"));
        cp.add(new JButton ("2"));
        cp.add(new JButton ("3"));
               
        setTitle("提交按钮组件按钮小试牛刀");//设置窗口标题
        setVisible(true);//设置窗口可视化
        setSize(500,500);//设置窗口的大小
        //设置窗口的关闭方式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JButtonTest jb=new JButtonTest();
    }

}