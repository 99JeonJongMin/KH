package chap05.exam01;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 성적을 차례대로 입력하세요.");
		for(int i=0; i<student.length; i++) {
			student[i] = sc.nextInt();
			sum += student[i];
		}
		System.out.println("5명의 평균점수 : "+(double)sum/student.length);
	}

}
