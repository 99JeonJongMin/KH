package sec03.exam07;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/images"); //디렉터리주소
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");

		if(dir.exists() == false) dir.mkdir();
		if(file1.exists() == false) file1.createNewFile();
		if(file2.exists() == false) file2.createNewFile();
		if(file3.exists() == false) file3.createNewFile();
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t 형태\t\t크기\t이름");
		System.out.println("============================================================");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm(E)");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}
			else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		System.out.println("============================================================");
		for(int i=0; i<contents.length; i++) {
			System.out.print(sdf.format(new Date(contents[i].lastModified())));
			if(contents[i].isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + contents[i].getName());
			} else {
				System.out.print("\t\t\t" + contents[i].length() + "\t" + contents[i].getName());
			}
			System.out.println();
		}
		
	}
}
