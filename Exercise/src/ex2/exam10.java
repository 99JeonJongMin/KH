package ex2;

import java.util.Scanner;

public class exam10 {
//	문제10. switch문을 사용하여 사용자로부터 하나의 문자를 입력받아서 문자가 'R' 또는 'r'이면 사각형의 면적을 계산하고 'C' 또는 'c'이면 원의 면적을 'T' 또는 't'는 삼각형의 면적을 계산하여 출력하는 자바프로그램을 작성하여 보시오. 단, 원주율은 3.141592를 사용하며 상수 처리하시오.
//	- 출력예 -
//	사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : T(C/R)
//	밑변의 길이(반지름/가로 길이)를 입력하세요 : 10 
//	높이(세로 길이)를 입력하세요 : 10
//	구하고자 하는 삼각형(원/사각형)의 면적은 50.00(314.16/100)입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int line = 0;
		int height = 0;
		int extent = 0;
		final double pi = 3.141592;
		System.out.println("사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : ");
		String menu = sc.next();
		
		switch(menu) {
		case "R":
		case "r":
			System.out.println("가로의 길이를 입력하세요 : ");
			line = sc.nextInt();
			System.out.println("세로를 입력하세요 : ");
			height = sc.nextInt();
			extent = line * height;
			System.out.println("구하고자 하는 사각형의 면적은 "+extent+"입니다.");
			break;
		case "C":
		case "c":
			System.out.println("반지름을 입력하세요");
			line = sc.nextInt();
			
			double cir = line*line*pi;
			double circle = Math.round(cir * 100)/100.0; //소숫점 둘째짜리까지 출력
			System.out.println("구하고자 하는 원의 면적은 "+circle+"입니다.");
			break;
		case "T":
		case "t":
			System.out.println("밑변의 길이를 입력하세요");
			line = sc.nextInt();
			System.out.println("높이를 입력하세요");
			height = sc.nextInt();
			
			extent = (line*height)/2;
			
			System.out.println("구하고자하는 삼각형의 면적은 "+extent+"입니다.");
			break;
		default:
			System.out.println("입력을 잘못 하셨습니다.");
			break;
		}
	}

}
