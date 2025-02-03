package sec03.exam05;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class InputStreamExam2 {
	public static void main(String[] args) throws Exception{
		Writer os = new FileWriter("c:/Temp/str.txt"); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			if(str.equals(":q")) break;
			System.out.println(str);
			os.write(str+"\n");
		}
		
		os.flush();
		os.close();
	}
}
