package ex4;

import java.util.Scanner;

public class exam01 {	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("두 정수를 입력하세요 : ");
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("나눗셈 연산식은 "+num1+ "/ "+num2+" = "+ num1/num2+"입니다.");
		} catch (ArithmeticException  e) {
			System.out.println("분모는 0으로 입력하지 마세요!");
		}
		
	}
}
