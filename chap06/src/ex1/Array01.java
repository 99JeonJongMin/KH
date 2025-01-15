package ex1;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = num[0];
		
		System.out.println("정수 5개를 입력 해주세요 : ");
		for(int i =0; i<5; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) max = num[i];
		}
		
		System.out.println("5개의 정수 중 가장 큰 값은 "+max+"입니다.");
	}

}
