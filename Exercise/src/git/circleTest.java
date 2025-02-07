package git;

import java.io.IOException;
import java.util.Scanner;

public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double PI = Math.PI;
		System.out.print("원기둥 밑면의 반지름을 입력하세요 : ");
		int line = sc.nextInt();
		System.out.print("원기둥의 높이를 입력하세요 : ");
		int height = sc.nextInt();
		
		double volume = ((line*line)*PI)*height;
		
		System.out.println("원기둥의 부피는 "+volume+"입니다.");
		pause();
		
		
	}
	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
