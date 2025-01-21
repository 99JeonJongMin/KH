package ex3_03;

import java.util.Scanner;

public class ScoreExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Score score = new Score();
		
		int sum = 0;
		
		int[] subject = new int[3];
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요 :");
		for(int i = 0; i<subject.length; i++) {
			subject[i] = sc.nextInt();
			sum += subject[i];
		}
		System.out.println("국어 : "+subject[0]+"점, 영어 : "+subject[1]+"점, 수학 : "+subject[2]+"점");
		System.out.println("세 과목의 합계는 "+sum+"이고 평균은 "+score.avg(sum)+"점 입니다.");
	}

}
