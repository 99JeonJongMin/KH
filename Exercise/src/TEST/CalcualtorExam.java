package TEST;

import java.util.Scanner;

public class CalcualtorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 정수값을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("덧셈 :"+calc.add(num1, num2));
		System.out.println("뺄셈 :"+calc.sub(num1, num2));
		System.out.println("곱셈 :"+calc.mul(num1, num2));
		System.out.println("나눗셈 :"+calc.div(num1, num2));
	}

}
