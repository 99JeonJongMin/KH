package ex1;

import java.util.Scanner;

public class exam10 {
//	문제10. B감귤농장에서 재배하는 감귤을 등급별로 나누어 분류하는 자바프로그램을 작성하여 보시오. 단, 등급은 크기별로 A, B, C로 나뉘며 어느 등급이더라도 10개가 되면 무한반복문을 종료시킨다.
//	- 출력예 -
//	감귤의 크기를 입력하세요 (A, B, C) : A
//	현재 A등급의 감귤은 1개입니다.
//	감귤의 크기를 입력하세요 (A, B, C) : C
//	현재 C등급의 감귤은 1개입니다.
//	...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("감귤의 크기를 입력하세요. (A,B,C)");
			String grade = sc.nextLine();
			
			switch(grade) {
			case "A":
			case "a":
				A+=1;
				System.out.println("현재A등급의 감귤은 "+A+"개입니다.");
				break;
			case "B":
			case "b":
				B+=1;
				System.out.println("현재B등급의 감귤은 "+B+"개입니다.");
				break;
			case "C":
			case "c":
				C+=1;
				System.out.println("현재C등급의 감귤은 "+C+"개입니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			
			}
//			if(A>=10 || B>=10 || C>=10)
			if(A>=10) {
				System.out.println("A등급의 감귤이 10개 찼습니다.");
				run =false;
			}
			if(B>=10) {
				System.out.println("B등급의 감귤이 10개 찼습니다.");
				run =false;
			}
			if(C>=10) {
				System.out.println("C등급의 감귤이 10개 찼습니다.");
				run =false;
			}
		}
	}

}
