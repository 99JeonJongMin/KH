package ex2;

import java.util.Scanner;

//문제3. 국어, 영어, 수학 점수를 입력받아 평균점수가 60점 이상이면 "합격", 60점 미만이면 "불합격"이라고 출력하는 자바프로그램을 작성하시오.
public class exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		int avg = sum/3;
		
		if(avg >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}
}
