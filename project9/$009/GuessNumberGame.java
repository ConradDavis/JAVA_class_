package $009;

import java.util.Scanner;

import javax.swing.JLabel;

public class GuessNumberGame {
	private int randNumber, guessNumber;
	public void generateRand() {// 1.ϵͳ����һ���������
		randNumber = (int) (Math.random() * 101);// [0,1)
	}
	public boolean compare(JLabel jlMessage) { // 3.�Ƚϣ����ˣ�����true������false������ʾ��С��
		boolean result = false;
		if (guessNumber > randNumber) {
			jlMessage.setText("���ˣ�");
		} else if (guessNumber < randNumber) {
			jlMessage.setText("С�ˣ�");
		} else {
			result = true;
			jlMessage.setText("���ˣ����ǣ�" + randNumber);
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