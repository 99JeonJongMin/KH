package ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] nums = new int[3];
			System.out.println("세 개의 정수를 입력하세요 : ");
			for(int i=0; i<nums.length; i++) {
				nums[i] = sc.nextInt();
			}
			
			System.out.println("정수 "+nums[0]+","+nums[1]+","+nums[2]+"의 곱은 "+nums[0]*nums[1]*nums[2]+"입니다.");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("정수 3개를 올바르게 입력하세요!");
		}
		
	}

}
