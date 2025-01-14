package ex1;

import java.util.Scanner;

public class exam06 {
//	문제6. for 반복문을 사용하여 3명의 점수를 입력받아 총점과 평균을 구하는 자바프로그램을 작성하여 보시오.
//	- 출력예 -
//	1번 학생의 점수를 입력하세요 : 60
//	2번 학생의 점수를 입력하세요 : 70
//	3번 학생의 점수를 입력하세요 : 80
//	3명의 점수 합계는 210점이고 평균은 70.00점입니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		for(int i =1; i<=3; i++) {
			System.out.println(i+"번 학생의 점수를 입력하세요 : ");
			int num = sc.nextInt();
			
			sum+=num;
		}
		avg = sum/3;
		System.out.println("3명의 점수 합계는 "+sum+"이고 평균은 "+avg+"점 입니다.");
	}

}
