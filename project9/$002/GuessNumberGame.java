package $002;

import java.util.Scanner;

public class GuessNumberGame {
	int randNumber, guessNumber;

	private void generateRand() {// 随机数
		randNumber = (int) (Math.random() * 101);// [0, 101]

	}

	private void readAGuessNumber() {// 输入数
		Scanner s = new Scanner(System.in);
		System.out.println("please input you guess number");
		guessNumber = s.nextInt();

	}

	private boolean compare() {// 比较，对返回true，错返回false

		if (guessNumber < randNumber) {
			System.out.println("xiao了");
		} else if (guessNumber > randNumber) {
			System.out.println("da了");
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

		} while (!compare());// 比较，对返回true，错返回false

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNumberGame game = new GuessNumberGame();

		game.play();

	}

}
