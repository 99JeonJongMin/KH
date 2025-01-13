package test2;

import java.util.Scanner;


public class test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int answer = (int)(Math.random()*100)+1;
		int count =0;
		
		System.out.println("*****************");
		System.out.println("* 숫자 맞추기 게임 *");
		System.out.println("*****************");
		while(check) {
			count +=1;
			System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input==answer) {
				System.out.println("축하합니다! 입력한 정수는"+input+"이며 정답입니다!");
				System.out.println("총 "+count+"번 시도 하셨습니다.");
				check = false;
			}
			else if(input>answer) {
				System.out.println("입력한 정수는"+input+"이며 정답보다 큰 수입니다.");
			}
			else if(input<answer){
				System.out.println("입력한 정수는"+input+"이며 정답보다 작은 수 입니다.");
			}
		}
	}
	
}
