package ex2;

import java.util.Scanner;

public class exam05 {
//	문제5. 정수값을 입력했을때 4의 배수인지를 판별하는 자바프로그램을 작성하시오.
//	- 출력예 -
//	정수값을 입력하세요 : 20(15)
//	입력하신 숫자는 20(15)이며 4의 배수입니다(4의 배수가 아닙니다).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 4 == 0) {
			System.out.println("입력하신 숫자는" + num + "이며 4의 배수입니다.");
		}
		else {
			System.out.println("입력하신 숫자는" + num + "이며 4의 배수가 아닙니다.");
		}
	}

}
