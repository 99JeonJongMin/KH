package ex3;

import java.util.Scanner;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("2개의 정수값을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
			
		System.out.println("덧셈 : "+calc.add(num1, num2));
		System.out.println("뺄셈 : "+calc.sub(num1, num2));
		System.out.println("곱셈 : "+calc.mul(num1, num2));
		System.out.println("나눗셈 : "+calc.div(num1, num2));
		System.out.println("나머지 : "+calc.remain(num1, num2));

	}

}
