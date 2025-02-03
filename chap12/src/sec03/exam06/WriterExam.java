package sec03.exam06;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriterExam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 이름을 입력 하십시오 : ");
		String name = sc.nextLine();
		Writer wr = new FileWriter("c:/Temp/"+name+".txt",true); 
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		String str = "국어점수 : "+kor+", 영어점수 : "+eng + ", 수학점수 : "+math;
		System.out.println(str);
		
		wr.write(str +"\n");
		
		wr.flush();
		wr.close();
		
	}

}
