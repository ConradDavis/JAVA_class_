package $013;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainView {

	private JPanel view;
    private SunView sunView;
    private JButton jbAdd,jbSub,jbUp,jbDown,jbLeft,jbRight;
	public MainView() {
		layout( );		
		BL bl= new BL();
		jbAdd.addActionListener(bl);
		jbSub.addActionListener(bl);
		jbUp.addActionListener(bl);
		jbDown.addActionListener(bl);
		jbLeft.addActionListener(bl);
		jbRight.addActionListener(bl);
	}

	public JPanel getView() {
		return view;
	}
	class BL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==jbAdd) {
				sunView.setSleepingTime(sunView.getSleepingTime()-5);
					
				}else if(event.getSource()==jbSub) {
					sunView.setSleepingTime(sunView.getSleepingTime()+10);
			}else if(event.getSource()==jbUp){
				       sunView.setUp(true);
			}else{
				sunView.setUp(false);
			}
			
		}
		
		
	}
	private void layout() {//布局
		view = new JPanel();
		sunView = new SunView();
		view.setLayout(new BorderLayout());
		view.add("Center",sunView);
		new Thread (sunView).start();
		JPanel ctrPanel = new JPanel();
		ctrPanel.setLayout(new  GridLayout(3,2));//三行两列
		ctrPanel.add(jbAdd= new JButton("+") );
		ctrPanel.add(jbSub= new JButton("-") );
		ctrPanel.add(jbUp=new JButton("shang"));
		ctrPanel.add(jbDown=new JButton("xia"));
		ctrPanel.add(jbLeft=new JButton("zuo"));
		ctrPanel.add(jbRight=new JButton("you"));
		view.add("South",ctrPanel);
		
		
	}
	
}
