package sec03.exam06;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExam {
	public static void main(String[] args) throws Exception{
		Reader rd = new FileReader("c:/Temp/안녕.txt");
		
		while(true) {
			int dat = rd.read();
			if(dat == -1) break;
			System.out.print((char)dat);
			
		}
		
		rd.close();
		
	}
}
