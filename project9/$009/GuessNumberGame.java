package $009;

import java.util.Scanner;

import javax.swing.JLabel;

public class GuessNumberGame {
	private int randNumber, guessNumber;
	public void generateRand() {// 1.系统生成一个随机数；
		randNumber = (int) (Math.random() * 101);// [0,1)
	}
	public boolean compare(JLabel jlMessage) { // 3.比较：对了，返回true，错返回false，并提示大小。
		boolean result = false;
		if (guessNumber > randNumber) {
			jlMessage.setText("大了！");
		} else if (guessNumber < randNumber) {
			jlMessage.setText("小了！");
		} else {
			result = true;
			jlMessage.setText("对了，就是：" + randNumber);
		}
		return result;
	}
	public int getRandNumber() {
		return randNumber;
	}
	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

}