package ex10;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryExam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Writer wr = new FileWriter("c:/temp/book.txt");
		List<Library> list = new ArrayList<Library>();
		boolean check = true;
		
		while(check) {
			System.out.println("도서명을 입력 하세요 : ");
			String bookname = sc.nextLine();
			System.out.println("저자를 입력 하세요 :");
			String author = sc.nextLine();
			System.out.println("출판사를 입력 하세요 : ");
			String pub = sc.nextLine();
			
			System.out.println("페이지수를 입력 하세요 : ");
			int pages = sc.nextInt(); sc.nextLine();
			System.out.println("가격을 입력 하세요 : ");
			int price = sc.nextInt(); sc.nextLine();
			
			list.add(new Library(bookname, author, pub, pages, price));
			wr.write("도서명 : " + bookname + " 출판사 : "+ pub + " 가격 : "+price+" 저자 : "+author+" 페이지 : "+pages+"\n");
			wr.flush();
			System.out.println("그만 입력 하시겠습니까(y/n)?");
			String checkS = sc.nextLine();
			
			if(checkS.equals("y") || checkS.equals("Y") ) {
				check = false;
			} else if(checkS.equals("n") || checkS.equals("N") ) {
				check = true;
			}
		}
		
		wr.close();
	}

}
