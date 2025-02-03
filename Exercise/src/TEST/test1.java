package TEST;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("2개의 정수값을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("덧셈 : "+(num1+num2));
		System.out.println("뺄셈 : "+(num1-num2));
		System.out.println("곱셈 : "+(num1*num2));
		System.out.println("나눗셈 : "+(num1/num2));
	}
}
