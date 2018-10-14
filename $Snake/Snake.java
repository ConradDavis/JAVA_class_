package $Snake;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;

public class Snake {
    ArrayList<Node> snake = new ArrayList<Node>(  );
    public static int score=0; 

    Snake() {
        snake.add(new Node(9, 1, Directions.RIGHT));
        snake.add(new Node(9, 0, Directions.RIGHT));
    }

    public void move() {
        Node node = null;
        int row = snake.get(0).location_row;
        int col = snake.get(0).location_col;
        switch (snake.get(0).direction) {
            case UP :
                node = new Node(row - 1, col, Directions.UP);
                break;
            case DOWN:
                node = new Node(row + 1, col, Directions.DOWN);
                break;
            case LEFT:
                node = new Node(row, col - 1, Directions.LEFT);
                break;
            case RIGHT:
                node = new Node(row, col + 1, Directions.RIGHT);
                break;

        }
        snake.add(0, node);
        snake.remove(snake.size() - 1);
    }

    public void eat(Apple apple) {
        int snake_row = snake.get(0).location_row;
        int snake_col = snake.get(0).location_col;
        int apple_row = apple.location_row;
        int apple_col = apple.location_col;
        if (snake_row == apple_row && snake_col == apple_col) {
            apple.reAppear();
            for(int i=0;i<snake.size();i++){
                if(apple.location_row==snake.get(i).location_row&&apple.location_col==snake.get(i).location_col){
                    apple.reAppear( );
                }
            }
            snakeGrow();
            score+=1;
        }
    }

	public void snakeGrow() {
        Node node = null;
        int row = snake.get(snake.size() - 1).location_row;
        int col = snake.get(snake.size() - 1).location_col;
        switch (snake.get(snake.size() - 1).direction) {
            case UP:
                node = new Node(row + 1, col, Directions.UP);
                break;
            case DOWN:
                node = new Node(row - 1, col, Directions.DOWN);
                break;
            case LEFT:
                node = new Node(row, col + 1, Directions.LEFT);
                break;
            case RIGHT:
                node = new Node(row, col - 1, Directions.RIGHT);
                break;
        }
        snake.add(node);
    }

    public boolean isAlive(  ) {
        int row = snake.get(0).location_row;
        int col = snake.get(0).location_col;
        if (row < 0 || row > CommonNumber.ROWS - 1 || col < 0 || col > CommonNumber.COLS - 1) {
            return false;
        }else {
            for (int i=2;i<snake.size();i++){
                if(row==snake.get(i).location_row&&col==snake.get(i).location_col){
                    return false;
                }
            }
        }
        return true;
    }

    public void draw(Graphics g) {
        move();
        for (int i = 0; i < snake.size(); i++) {
            snake.get(i).draw(g);
        }
    }

    public void keyPressed(KeyEvent e) {
        //int key=e.getKeyCode();
        //System.out.println(e.getKeyCode());
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (snake.get(0).direction != Directions.DOWN)
                    snake.get(0).direction = Directions.UP;
                break;
            case KeyEvent.VK_DOWN:
                if (snake.get(0).direction != Directions.UP)
                    snake.get(0).direction = Directions.DOWN;
                break;
            case KeyEvent.VK_LEFT:
                if (snake.get(0).direction != Directions.RIGHT)
                    snake.get(0).direction = Directions.LEFT;
                break;
            case KeyEvent.VK_RIGHT:
                if (snake.get(0).direction != Directions.LEFT)
                    snake.get(0).direction = Directions.RIGHT;
                break;
        }
    }
}

class Node {
    int location_row;
    int location_col;
    Directions direction = Directions.RIGHT ;

    Node(int locations_row, int locations_col, Directions direction) {
        this.location_row = locations_row;
        this.location_col = locations_col;
        this.direction = direction;
    }

    public void draw(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED );
        g.fillOval(location_col * CommonNumber.BLOCK_SIZE, location_row * CommonNumber.BLOCK_SIZE,
        		CommonNumber.BLOCK_SIZE, CommonNumber.BLOCK_SIZE);
        g.setColor(c);
    }
}