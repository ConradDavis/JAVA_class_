package $002;

import java.util.Scanner;

public class GuessNumberGame {
	int randNumber, guessNumber;

	private void generateRand() {// �����
		randNumber = (int) (Math.random() * 101);// [0, 101]

	}

	private void readAGuessNumber() {// ������
		Scanner s = new Scanner(System.in);
		System.out.println("please input you guess number");
		guessNumber = s.nextInt();

	}

	private boolean compare() {// �Ƚϣ��Է���true������false

		if (guessNumber < randNumber) {
			System.out.println("xiao��");
		} else if (guessNumber > randNumber) {
			System.out.println("da��");
		} else {
			System.out.println("dui::" + randNumber);
			return true;
		}
		return false;

	}

	private void play() {
		generateRand();//
		do {
			readAGuessNumber();

		} while (!compare());// �Ƚϣ��Է���true������false

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNumberGame game = new GuessNumberGame();

		game.play();

	}

}
