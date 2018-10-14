package $011.collections;
/*��Ŀ��ĳһ���ֲμӸ���������
 ��30����ί�����Ľ��д�֣�
 �����һ��������score[]��
����Ϊ1��100֮����������
�������forѭ��ʵ�����
��λѡ�ֵ���߷֡���ͷֺ����յ÷�
�����յ÷�=�ܷ���/��ί��������*/

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
