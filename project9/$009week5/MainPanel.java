package $009week5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel {//panelΪ����
private JPanel  panel;
private JLabel jlInput,jlMessage;//��ǩ
private JTextField jtfInput;//�ı���
private JButton jbOk,jbRestart;//��ť
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
				public void actionPerformed(ActionEvent arg0) {//����
					// TODO Auto-generated method stub
					int num = Integer.parseInt(jtfInput.getText());
					engine.setGuessNumber(num);
					engine.compare(jlMessage);
					//jlMessage.setText("num=  "+num);
					//System.out.println("num=   "+num);
					
					
	    }
  }

private void layout( ) {
	
	jlInput = new  JLabel("�����������");
	jlMessage  =new  JLabel("��Ϣ��ʾ.....");
	jtfInput  =new  JTextField( );
	jbOk = new JButton("��");
	jbRestart = new JButton("��ʼһ������Ϸ");
	
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
