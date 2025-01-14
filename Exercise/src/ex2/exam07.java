package ex2;

import java.util.Scanner;

public class exam07 {

//	문제7. 2개의 정수를 입력받아 해당하는 번호를 선택하면 사칙연산을 하는 자바프로그램을 작성하여 보시오.
//	- 출력예 -
//	2개의 정수를 입력하세요 : 20 30
//	사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료
//	1
//	입력하신 정수의 덧셈은 50입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		
		boolean set = true;
		while(set) {
			System.out.println("사칙 연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료");
			int branch = sc.nextInt();
		switch(branch) {
			
		case 1:
			int sum = num1+num2;
			System.out.println("입력하신 정수의 덧셈은"+sum+"입니다.");
			break;
		case 2:
			int minus = num1-num2;
			System.out.println("입력하신 정수의 뺄셈은"+minus+"입니다.");
			break;
		case 3:
			int multi = num1*num2;
			System.out.println("입력하신 정수의 곱셈은"+multi+"입니다.");
			break;
		case 4:
			int divide = num1/num2;
			System.out.println("입력하신 정수의 나눗셈은"+divide+"입니다.");
			break;
		case 5:
			System.out.println("종료되었습니다.");
			set = false;
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}
		}
	}

}
