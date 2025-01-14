package ex2;

import java.util.Scanner;

public class exam09 {

//	문제9. 오옴의 법칙(v=ir)을 활용하여 각각의 값을 입력하면 전압, 전류, 저항을 계산하여 출력하는 자바프로그램을 작성하여 보시오.
//	- 출력예 -
//	(1) 전압계산 (2) 전류계산 (3) 저항계산 (4) 종료
//	1
//	전류(암페어)를 입력하세요 : 10
//	저항(오옴)을 입력하세요 : 5
//	전압을 계산하면 50(볼트)입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean set = true;
		
		while(set) {
		System.out.println("(1) 전압계산 (2) 전류계산 (3) 저항계산 (4) 종료");
		int menu = sc.nextInt();
		int i = 0;
		int r = 0;
		int v = 0;
		switch(menu) {
		case 1:
			System.out.println("전류(암페어)를 입력하세요 : ");
			i = sc.nextInt();
			System.out.println("저항(오옴)을 입력하세요 : ");
			r = sc.nextInt();
			
			v = i*r;
			System.out.println("전압을 계산하면 "+v+"(볼트)입니다.");
			break;
		case 2:
			System.out.println("전압(볼트)을 입력하세요 : ");
			v = sc.nextInt();
			System.out.println("저항(오옴)을 입력하세요 : ");
			r = sc.nextInt();
			
			i = v/r;
			System.out.println("전류를 계산하면 "+i+"(암페어)입니다.");
			break;
		case 3:
			System.out.println("전류(암페어)를 입력하세요 : ");
			i = sc.nextInt();
			System.out.println("전압(볼트)를 입력하세요 : ");
			v = sc.nextInt();
			
			r = v/i;
			System.out.println("저항을 계산하면 "+r+"(오옴)입니다.");
			break;
		case 4:
			System.out.println("종료 하였습니다.");
			set = false;
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			
			
		}
		
		}
		
	}

}
