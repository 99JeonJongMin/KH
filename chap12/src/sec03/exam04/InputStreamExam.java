package sec03.exam04;

import java.io.*;

public class InputStreamExam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is =System.in;
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		while(true) {
			System.out.print("문자열을 입력하세요 : ");
			String str = br.readLine();
			if(str.equals(":q") || str.equals("quit")) break;
			System.out.println("입력 받은 문자열 : "+str);
		}
		br.close();
	}

}
