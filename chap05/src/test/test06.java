package test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum=0;
		double avg = 0.0;
		int max=0;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = sc.nextInt();
					sum += scores[i];
				}
				avg = (double)sum/scores.length;
				break;
			case 3:
				for(int i =0; i<scores.length;i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				break;
			case 4:
				for(int i : scores) {
					if(max< i) {
						max = i;
					}
				}
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+Math.round(avg*100)/100.0);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
	}

}
