package $Snake;

import java.awt.*;
import java.util.Random;

public class Apple {
    int location_row;
    int location_col;
    Random random = new Random( );

    Apple() {
        this.location_row = random.nextInt(CommonNumber.ROWS);
        this.location_col = random.nextInt(CommonNumber.COLS);
    }

    public void reAppear() {
        this.location_row = random.nextInt(CommonNumber.ROWS);
        this.location_col = random.nextInt(CommonNumber.COLS);
    }

    public void draw(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.GREEN);
        g.fillRect(CommonNumber.BLOCK_SIZE * location_col, CommonNumber.BLOCK_SIZE * location_row, 
        		CommonNumber.BLOCK_SIZE, CommonNumber.BLOCK_SIZE);
        g.setColor(c);
    }
}
