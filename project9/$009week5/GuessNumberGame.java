package $009week5;

import javax.swing.JLabel;

public class GuessNumberGame {
	int randNumber, guessNumber;

	public void generateRand() {// 随机数
		randNumber = (int) (Math.random() * 101);// [0, 101]

	}

	boolean compare(JLabel jlMessage) {// 比较，对返回true，错返回false

		if (guessNumber < randNumber) {
			jlMessage.setText("小了....");
		} else if (guessNumber > randNumber) {
			jlMessage.setText( "大了...");
		} else {
			jlMessage.setText("对了，恭喜 "+randNumber);
			return true;
		}
		return false;

	}

	public int getRandNumber() {
		return randNumber;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}
}
   