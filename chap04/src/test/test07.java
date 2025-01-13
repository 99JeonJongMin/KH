package test;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		
	boolean run = true;
	int balance = 0;
	Scanner sc = new Scanner(System.in);

	int money =0;
	int minus =0;
	
	while(run) {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("예금액>");
			money += sc.nextInt();
			break;
		case 2:
			System.out.print("출금액>");
			minus = sc.nextInt();
			if(money<minus) {
				System.out.println("잔고가 부족합니다!");
				System.out.println("현재잔고 : "+money);
				continue;
			}
			money -=minus;
			break;
		case 3:
			System.out.println("잔고>"+money);
			
			break;
		case 4:
			System.out.println("");
			run = false;
		
		default:
			System.out.println("번호를 잘못 입력하셨습니다!");
		}
	}

	System.out.println("프로그램 종료");
 }
}