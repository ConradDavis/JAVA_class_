
package $Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame{    
	
	JPanel pane=new JPanel( );
    Garden garden = new Garden(  );
    ScorePanel scorePanel=new ScorePanel(  );
    MaxTxt m= new MaxTxt(  );
   SnakeIO s = new SnakeIO( );
	
    JFrame mainFrame;
    
    public  void score(String str){
    	String[   ] newstr=str.split("  ,");
    	scorePanel.Score.setText(newstr[1]);

 	}    
            
    public MainWindow( ) {
        mainFrame = new JFrame("Snake");
        mainFrame.setLocation(400, 200);
        //mainFrame.setLayout(new BorderLayout());
        new Thread(scorePanel).start( );
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        mainFrame.add(scorePanel,"West");
        mainFrame.add(garden,"South");
        mainFrame.pack(  );
        mainFrame.addKeyListener(new KeyMonitor());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        s.write(" 这是游戏生成文件");
    	s.read( );
        
    }
    
    public class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            garden.snake.keyPressed(e);
        }
    }


}
