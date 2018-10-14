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
 * 1:��ť��Swing���ǽ�Ϊ��������������ڴ����ض�����
 * Swing���ṩ�˶��ְ�ť�������ύ��ť����ѡ�򣬵�ѡ��ť��
 * ��Щ��ť���Ǵ�AbstractButton���м̳ж�����
 * 
 * 2:Swing�е��ύ��ť���(JButton)��JButton�����ʾ
 * JButton����4����Ҫ�Ĺ��췽��
 * ����text,icon�ֱ������ʾ���ֱ�ǩ��ͼ��
 * 
 * 3:��ʵ��ʹ�������ַ�ʽ������ť����һ�����ڳ�ʼ����ťʱ���谴ťͼ��������
 * ���ֳ�ʼ�������Ȼ��ͼƬ·����Ȼ��·��ʵ������Icon��Ȼ����Button�м��س���
 * �ڶ��ַ�ʽ�����ȴ���һ��û�ж���ͼ������ֵİ�ť����Ȼ��ʹ��
 * setIcon()����Ϊ�����ť����һ��ͼ�ꡣ
 * setToolTipText()������Ϊ��ť������ʾ���֣����ͣ���ڰ�ť���漴��
 * setBorderPainted()�������ñ߽��Ƿ���ʾ
 * setMaximumSize()�������ð�ť�Ĵ�С��ͼ��Ĵ�Сһ�£����෽����Ҫ�Ĳ���������
 *           Dimension�������������ȥ��ͼƬ����ͬ��ťһ���ڷ��ڴ����У�
 *           ͬʱҲ����ʹ��setEnabled()�������ð�ť�Ƿ����
 * 
 * @author biexiansheng
 *
 */
public class JButtonTest extends JFrame{


	public JButtonTest(){//����һ�����췽��
        
        Container cp= this.getContentPane();
        cp.setLayout(new GridLayout(1,4,1,1));
        //cp.setLayout(new FlowLayout(FlowLayout,LEFT,10,10));
        cp.add(new JButton ("1"));
        cp.add(new JButton ("2"));
        cp.add(new JButton ("3"));
               
        setTitle("�ύ��ť�����ťС��ţ��");//���ô��ڱ���
        setVisible(true);//���ô��ڿ��ӻ�
        setSize(500,500);//���ô��ڵĴ�С
        //���ô��ڵĹرշ�ʽ
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JButtonTest jb=new JButtonTest();
    }

}