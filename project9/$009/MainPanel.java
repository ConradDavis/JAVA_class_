package $009;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel {
	private JPanel panel;
	private JLabel jlInput,jlMessage;
	private JTextField jtfInput;
	private JButton jbOk,jbRestart;
	private GuessNumberGame engine;//1

	public MainPanel() {
		panel = new JPanel();
		engine = new GuessNumberGame();//2
		engine.generateRand();//3
		this.layout();
		jbOk.addActionListener(new OKListener());
	}
	class OKListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int num = Integer.parseInt(jtfInput.getText());
			engine.setGuessNumber(num);//4
			engine.compare(jlMessage);//5
		}		
	}
	private void layout() {
		jlInput = new JLabel("请输入猜的数字：");
		jlMessage = new JLabel("消息提示...");
		jtfInput = new JTextField( );
		jbOk = new JButton("猜");
		jbRestart = new JButton("开始一个新游戏");
		
		panel.setLayout(new GridLayout(4,1));
		
		panel.add(jbRestart);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(1,2));
		inputPanel.add(jlInput);
		inputPanel.add(jtfInput);
		panel.add(inputPanel);
	
		panel.add(jbOk);
		panel.add(jlMessage);
	}

	public JPanel getPanel() {
		return panel;
	}
	
	
}
