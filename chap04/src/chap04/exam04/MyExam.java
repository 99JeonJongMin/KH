package chap04.exam04;

import java.util.Scanner;

public class MyExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("처음 시작할 값을 입력하세요 : ");
		int startNum = sc.nextInt();
		
		System.out.print("최대값을 입력하세요 : ");
		int until = sc.nextInt();
		int volume = (until - startNum)+1;
		
		for(int i = 0; i<=10; i++) {
			int num01 = (int)(Math.random()*volume) +startNum;
			System.out.println(num01);
		}
	}

}

