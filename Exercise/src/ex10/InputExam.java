package ex10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class InputExam {
	public static void main(String[] args) throws Exception{
		Reader rd = new FileReader("c:/Temp/input.txt");
		Writer wr = new FileWriter("c:/Temp/output3.txt");
		
		while(true) {
			int dat = rd.read();
			if(dat == -1) break;
			System.out.print((char)dat);
			wr.write(dat);
			wr.flush();
			
		}
		wr.close();
		rd.close();
		
	}
}
