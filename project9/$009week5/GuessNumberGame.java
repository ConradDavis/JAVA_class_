package $009week5;

import javax.swing.JLabel;

public class GuessNumberGame {
	int randNumber, guessNumber;

	public void generateRand() {// �����
		randNumber = (int) (Math.random() * 101);// [0, 101]

	}

	boolean compare(JLabel jlMessage) {// �Ƚϣ��Է���true������false

		if (guessNumber < randNumber) {
			jlMessage.setText("С��....");
		} else if (guessNumber > randNumber) {
			jlMessage.setText( "����...");
		} else {
			jlMessage.setText("���ˣ���ϲ "+randNumber);
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
   