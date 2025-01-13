package test;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		
	boolean run = true;
	int balance = 0;
	Scanner sc = new Scanner(System.in);
	
	while(run) {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.출금 | 4.종료");
		System.out.println("-------------------------------");
		System.out.println("선택> ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("예금액>10000");
			break;
		case 2:
			System.out.println("출금액>2000");
			break;
		case 3:
			System.out.println("잔고>8000");
			break;
		default:
			System.out.println("");
			run = false;
		}
	}

	System.out.println("프로그램 종료");
 }
}