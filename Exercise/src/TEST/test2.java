package TEST;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		
		while(sum <500) {
		System.out.print("정수를 입력하세요 : ");
		sum += sc.nextInt();
		if(sum < 500)
		System.out.println("현재까지의 합계는 "+sum+"입니다.");
		
		else {
			System.out.println("합계가 500이상이며 전체 합계는 "+sum+"입니다.");
		}
		}
	}
}
