package ex10;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class OutputExam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer wr = new FileWriter("C:/Temp/output1.txt");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		System.out.print("몸무게(kg) 입력하세요 : ");
		int weight = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String str = "===== 입력결과 =====\n"+name+"님의 키 : "+height+"cm, 몸무게 : "+weight+"kg, 나이 : "+age+"세";
		wr.write(str);
		System.out.println(str);
		wr.flush();
		wr.close();
		
	}

}
