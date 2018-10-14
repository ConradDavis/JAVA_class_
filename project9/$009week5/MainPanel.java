package $009week5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel {//panel为画布
private JPanel  panel;
private JLabel jlInput,jlMessage;//标签
private JTextField jtfInput;//文本框
private JButton jbOk,jbRestart;//按钮
private GuessNumberGame engine;


public Object game;
public MainPanel( ) {
	panel= new JPanel( );              
         engine = new GuessNumberGame();
         engine.generateRand();
         this.layout( );	
         jbOk.addActionListener(new OKListener( ));
         
}
              class OKListener implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent arg0) {//抽象
					// TODO Auto-generated method stub
					int num = Integer.parseInt(jtfInput.getText());
					engine.setGuessNumber(num);
					engine.compare(jlMessage);
					//jlMessage.setText("num=  "+num);
					//System.out.println("num=   "+num);
					
					
	    }
  }

private void layout( ) {
	
	jlInput = new  JLabel("请输入猜数字");
	jlMessage  =new  JLabel("消息提示.....");
	jtfInput  =new  JTextField( );
	jbOk = new JButton("猜");
	jbRestart = new JButton("开始一个新游戏");
	
	panel.setLayout(new GridLayout(4,1));
	panel.add(jbRestart);
	JPanel inputPanel = new JPanel();
	inputPanel.setLayout(new  GridLayout(1,2));
	inputPanel.add(jlInput);
	inputPanel.add(jtfInput);
	//panel.add(jlInput);
	//panel.add(jtfInput);
	panel.add(inputPanel);
	panel.add(jbOk);
	panel.add(jlMessage);
	
}

public JPanel getPanel( ) {
	return panel;
	
	
	
    }
	
}
