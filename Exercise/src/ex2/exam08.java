package ex2;

import java.util.Scanner;

public class exam08 {
//	문제8. 국어, 영어, 수학 3과목의 점수를 입력받아 아래 출력예와 같이 출력하는 자바프로그램을 작성하시오.
//	- 출력예 -
//	국어, 영어, 수학 점수를 차례대로 입력하세요 : 70 70 70
//	메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : 1(2)
//	국어, 영어, 수학 점수의 총점(평균)은 210(70.00)점입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = kor+eng+math;
		int avg = sum/3;
		
		boolean set = true;
		
		while(set) {
		System.out.println("메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("국어, 영어, 수학 점수의 총점은 "+sum+"점입니다.");
			break;
		case 2:
			System.out.println("국어, 영어, 수학 점수의 총점은 "+avg+"점입니다.");
			break;
		case 3:
			System.out.println("종료 되었습니다.");
			set = false;
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
		}
		
	}

}
