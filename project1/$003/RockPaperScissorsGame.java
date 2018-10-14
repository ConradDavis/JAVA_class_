package $003;

import java.util.Scanner;

public class RockPaperScissorsGame {
	private int round,current;
	private Hand computerHand,playerHand;
	private int computerWin,playerWin;
	
	public RockPaperScissorsGame(int round) {
		this.round = round;
	}
	public void play() {	
		do {
			generateRand();//1�������������
			readPlayer();//2�Ӽ��̶�����ҵ�ѡ��
			compare();//3��������Ӯ������
			showThisRoundResult();//������ʾ���ֵĽ����
		}while(!judugeEnd());//4�ж��Ƿ���������غϵ��˻��߷ֳ���Ӯ��,����Ϸ������
		//      ���������һ����
		showFinalResult();//5��ӡ���ս��
	}
	private void showFinalResult() {
		System.out.println("Computer wins "+computerWin);
		System.out.println("Player wins "+playerWin);
		if(computerWin > playerWin) {
			System.out.println("The Winner is computer!");
		}else if(computerWin < playerWin) {
			System.out.println("The Winner is player!");
		}else {
			System.out.println("It is dogfall!");
		}		
	}
	private boolean judugeEnd() {
		boolean isEnd = false;
		if(current == round 
				|| computerWin >= round/2+1
				|| playerWin >= round/2+1) {
			isEnd = true;
		}
		return isEnd;
	}
	private void showThisRoundResult() {
		System.out.println("Computer shows "+computerHand);
		System.out.println("Player shows "+playerHand);		
	}
	private void compare() {
		if(computerHand == Hand.PAPER && playerHand == Hand.STONE) {
			computerWin++;
		}else if(computerHand == Hand.PAPER && playerHand == Hand.SCISSORS) {
			playerWin++;
		}else if(computerHand == Hand.SCISSORS && playerHand == Hand.PAPER) {
			computerWin++;
		}else if(computerHand == Hand.SCISSORS && playerHand == Hand.STONE) {
			playerWin++;
		}else if(computerHand == Hand.STONE && playerHand == Hand.PAPER) {
			playerWin++;
		}else if(computerHand == Hand.STONE && playerHand == Hand.SCISSORS) {
			computerWin++;
		}else {
			System.out.println("This round is dogfall!");
		}
		
	}
	private void readPlayer() {
		Scanner s = new Scanner(System.in);
		System.out.println("���ȭ��[0/1/2]:");
		int read = s.nextInt();
		playerHand = getHand(read);
	}
	private void generateRand() {
		int rand = (int)(Math.random()*3);
		computerHand = getHand(rand);
	}	
	private Hand getHand(int num) {
		switch(num){
			case 0:return Hand.STONE;
			case 1:return Hand.PAPER;
			case 2:return Hand.SCISSORS;
			default:return null;
		}
	}
	public static void main(String[] args) {
		new RockPaperScissorsGame(5).play();
	}
}