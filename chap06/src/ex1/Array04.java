package ex1;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[3][4];
		int[] sum = new int[3];
		double[] avg = new double[3];
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(i+1+"번 학생의 4과목 성적을 차례대로 입력하세요.");
			for(int j=0; j<scores[i].length; j++) {
				
				scores[i][j] = sc.nextInt();
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i]/4;
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(i+1+"번 할생의 총점은"+sum[i]+"점 이고 평균은 "+(double)avg[i]+"점입니다.");
		}
		
	}

}
