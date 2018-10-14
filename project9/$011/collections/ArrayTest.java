package $011.collections;
/*题目：某一歌手参加歌曲大奖赛，
 有30个评委对她的进行打分，
 存放在一个数组里score[]，
分数为1到100之间的随机数，
编程利用for循环实现输出
这位选手的最高分、最低分和最终得分
（最终得分=总分数/评委总人数）*/

public class ArrayTest {
	public static void generateScore(int[] score) {
		for(int i = 0; i < score.length;i++) {
			score[i] = (int)(Math.random()*101);
		}
	}
	public static int maxScore(int[] score) {
		int max = 0;
		for(int i = 0; i < score.length;i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		return max;
	}
	public static int minScore(int[] score) {
		int min = 100;
		for(int i = 0; i < score.length;i++) {
			if(score[i] < min) {
				min = score[i];
			}
		}
		return min;
	}
	public static double finalScore(int[] score) {
		double finalScore = 0;
		double sum = 0;
		for(int i = 0; i < score.length;i++) {
			sum+=score[i];
		}
		finalScore = sum / score.length;
		return finalScore;
	}	
	public static void main(String[] args) {
		int[] score = new int[30];
		
		generateScore(score);		
		System.out.println("max: "+maxScore(score));
		System.out.println("min: "+minScore(score));
		System.out.println("final: "+finalScore(score));
	}
}
