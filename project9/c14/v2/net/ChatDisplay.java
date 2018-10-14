package c14.v2.net;
import javax.swing.*;
import java.awt.*;
	
	public class ChatDisplay extends JPanel{
	    private JPanel interfacePanel;
	    private JPanel userPanel;
	    private JLabel userLabel;
	    private JComboBox userComboBox;
	    private JLabel messageLabel;
	    private JButton sendButton;
	    private JTextField messageText;      
	    private JTabbedPane textTabbedPane;
	    private JScrollPane publicScrollPane;
	    private JTextPane publicTextPane;
	    private JScrollPane privateScrollPane;
	    private JTextPane privateTextPane;

	    public ChatDisplay(){      
	      interfacePanel=new JPanel();
	      interfacePanel.setLayout(new BorderLayout(10,10));    
	    //�����˵���
	          //ʵ�����˵���˵���
	        JMenu[] menus={ new JMenu("File"),new JMenu("Action")};
	        JMenuItem[] items={new JMenuItem("Save"),new JMenuItem("Exit")};
	        menus[0].add(items[0]);
	      menus[0].add(items[1]);
	          //ʵ�����˵�������Ӳ˵������˵���
	        JMenuBar mb = new JMenuBar();
	      mb.add(menus[0]);
	      mb.add(menus[1]);
	        //���ò˵�����λ���ڽ�������Ϸ�
	      interfacePanel.add(mb,BorderLayout.NORTH);    

	    //�����������Ϣ���    
	         //ʵ�������к�˽�е��ı��� �� ������塢���ò��ɶ�        
	        publicTextPane=new JTextPane();
	        publicScrollPane=new JScrollPane(publicTextPane);    
	        publicTextPane.setEditable(false);

	        privateTextPane=new JTextPane();
	        privateScrollPane=new JScrollPane(privateTextPane);        
	        privateTextPane.setEditable(false);
	          //ʵ������̬ѡ�
	        textTabbedPane=new JTabbedPane();
	        textTabbedPane.addTab("public",publicScrollPane);
	        textTabbedPane.addTab("private",privateScrollPane);
	        textTabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
	        interfacePanel.add(textTabbedPane,BorderLayout.CENTER);

	   //����ײ����û����
	             //ʵ��������ʼ���������
	        userPanel =new JPanel();                  
	        userLabel=new JLabel("    Send to :");
	        userComboBox=new JComboBox();
	        String users[]={"Public","ClientB","CientA"};
	        userComboBox.addItem(users[0]); 
	        userComboBox.addItem(users[1]); 
	        userComboBox.addItem(users[2]);
	        messageLabel=new JLabel("Message:");
	        messageText=new JTextField(22);
	        sendButton=new JButton("Send");    
	    //Ϊ�����uesePanel�����в���        
	        //userPanel ����Ϊ����һ�е����񲼾֣����зֱ��������壬userPanel2.��userPanel
	        userPanel.setLayout(new GridLayout(2,1));
	        JPanel userPanel2 =new JPanel();        
	        JPanel userPanel3 =new JPanel();
	        userPanel.add(userPanel2 );
	        userPanel.add(userPanel3);

	        //��һ�е���� userPanel2 ��������׼��λ���֣������һ����ǩ����Ͽ� 
	        userPanel2.add(userLabel);
	        userPanel2.add(userComboBox);
	        GridBagLayout gridbag=new GridBagLayout();        
	        userPanel2.setLayout(gridbag);
	        //�Ե�һ�еڶ��������Ͽ���в���Լ��,ʵ����һ������C
	        GridBagConstraints c=new GridBagConstraints();
	        //����Ͽ�����������ĵı���   
	        c.weightx=1;
	        c.weighty=1;
	        //���������ռ�ĵ�λ��������ʣ���ʱ���������䷽ʽΪˮƽ
	        c.fill=GridBagConstraints.HORIZONTAL;
	        //��������֮ǰ�ľ��룬��������Ϊ�� �� �� �� 
	        c.insets=new Insets(0,10,0,5);
	        //������Լ���������Ͽ���
	        gridbag.setConstraints(userComboBox,c); 

	        //�ڶ��е���� userPanel3���������֣����һ����ǩ��һ�������ı��Ŀ�һ�����Ͱ�ť                              
	        userPanel3.setLayout(new FlowLayout());
	        userPanel3.add(messageLabel);
	        userPanel3.add(messageText);
	        userPanel3.add(sendButton);           
	        //������ҳ���·����������嵽�û������ȥ
	        interfacePanel.add(BorderLayout.SOUTH,userPanel);   
	        JFrame frame=new JFrame();     
	        frame.add(interfacePanel);
	        frame.setVisible(true);
	        frame.setSize(420,400);
	    } 
	    public static void main(String[] args) {
	          new ChatDisplay();
	    }
	 }

