package $Snake;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel implements Runnable{//线程启动在MainView
	
    JLabel Score=new JLabel( );
    MaxTxt m= new MaxTxt();
    ScorePanel(){
        Score.setText("Score:"+Snake.score);
        this.setSize(CommonNumber.BLOCK_SIZE * CommonNumber.COLS,
        		CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        this.setBackground(Color.yellow);
        this.add(Score);
        //new Thread(new Score ( )).start();    
    }

        public void run() {
            while (true) {
                repaint( );
                try {
                    Score.setText("Score:"+Snake.score);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
   
        public void maxScore( ){
    		String str = m.readTxt();
    		String[ ] newstr=str.split(",");
    		int c = Integer.parseInt(newstr[1]);						
    			if(Snake.score>c) {
    				c=Snake.score ;		
    			}      			
    		m.write(c);
    	}
        
        
    }

