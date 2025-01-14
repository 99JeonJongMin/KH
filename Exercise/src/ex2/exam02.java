package ex2;

import java.util.Scanner;

//문제2. 나이를 입력받아 19세 이상이면 "성년", 19세 미만이면 "미성년"이라고 출력하는 자바프로그램을 작성하시오.
public class exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		
		int age = sc.nextInt();
		
		if(age>=19) {
			System.out.println("성년");
		}
		else {
			System.out.println("미성년");
		}
	}
}
