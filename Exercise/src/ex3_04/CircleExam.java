package ex3_04;

import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CircleRadius circle = new CircleRadius();
		
		System.out.println("원의 반지름을 입력하세요 : ");
		double r = sc.nextDouble();
		double result = Math.round(circle.circumstance(r)*100.0)/100.0;
		
		System.out.println("원의 둘레는 "+result+"이며 원의 면적은 "+circle.area(r)+"입니다.");
		
	}

}
