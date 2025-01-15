package ex1;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int min = Integer.MAX_VALUE;
		
		System.out.println("정수 5개를 입력 해주세요 : ");
		for(int i =0; i<5; i++) {
			num[i] = sc.nextInt();
			if(min>num[i]) min = num[i];
		}
		
		System.out.println("5개의 정수 중 가장 큰 값은 "+min+"입니다.");
	}
}
