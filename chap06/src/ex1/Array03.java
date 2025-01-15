package ex1;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] man = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		System.out.print("5명의 성적을 차례대로 입력해 주세요 : ");
		for(int i=0; i<man.length; i++) {
			man[i] = sc.nextInt();
			
			sum+=man[i];
			
			if(max<man[i]) max = man[i];
			if(min>man[i]) min = man[i];
		}
		
		System.out.println("5명의 평균점수 : "+(double)sum/5);
		System.out.println("5명의 최고점수 : "+max);
		System.out.println("5명의 최저점수 : "+min);
	}
}
