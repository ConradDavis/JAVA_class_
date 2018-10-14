package $Snake;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Garden extends Canvas {
    Snake snake = new Snake();
    Apple apple = new Apple();
    Image offScreenImage = null;

    public Garden( ) {
        this.setSize(CommonNumber.BLOCK_SIZE * CommonNumber.COLS, 
        		CommonNumber.BLOCK_SIZE * CommonNumber.ROWS );
        //this.setBackground(Color.white);
        //this.addKeyListener(new KeyMonitor()); 
        new Thread(new PaintThread()).start();
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(new Color(180, 180, 180));//绘制颜色
        g.fillRect(0,0,CommonNumber.BLOCK_SIZE * CommonNumber.COLS, 
        		CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
       //g.setColor(Color.lightGray);

        snake.draw(g);
        apple.draw(g);
        snake.eat(apple);
        if(snake.isAlive()==false){
            g.setColor(Color.blue);
            Font font=new Font("Serif",Font.BOLD,25);//字体风格
            g.setFont(font);
            g.drawString("结束了",180,100);
            g.drawString("达到了"+Snake.score,180,140);
        }
        g.setColor(c);
    }

    @Override
    public void update(Graphics g) {//添加双缓冲技术
        //super.update(g);
        if (offScreenImage == null)
            offScreenImage = this.createImage(CommonNumber.BLOCK_SIZE * CommonNumber.COLS, 
            		CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        Graphics gOff = offScreenImage.getGraphics();
        if(gOff!=null){
            paint(gOff);
        }
        else{
            paint(g);
        }
        g.drawImage(offScreenImage, 0, 0, this);
    }


    public class PaintThread implements Runnable {
        @Override
        public void run( ) {
            while (snake.isAlive()) {  
                repaint();
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
