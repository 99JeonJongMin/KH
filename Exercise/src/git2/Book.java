package git2;

import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);
	int no;
	String name;
	String author;
	String pub;
	int price;
	
	public Book(int no,String name, String author, String pub, int price) {
		this.no = no;
		this.name = name;
		this.author = author;
		this.pub = pub;
		this.price = price;
	}
	
	public Book() {
	}
	
	public int getNo() {
		return no;
	}
	public void menu() {
		System.out.println("== 메뉴 ==\r\n"
				+ "1. 도서 추가\r\n"
				+ "2. 도서 조회\r\n"
				+ "3. 도서 삭제\r\n"
				+ "4. 종료");
	}
	
	public Book insert () {
		this.no = ++this.no;
		System.out.println("도서명을 입력하세요 : ");
		this.name = sc.nextLine();
		System.out.println("저자를 입력하세요 : ");
		this.author = sc.nextLine();
		System.out.println("출판사를 입력하세요 : ");
		this.pub = sc.nextLine();
		System.out.println("가격을 입력하세요 : ");
		this.price = sc.nextInt();
		sc.nextLine();
		Book books = new Book(no, name, author, pub, price);
		
		return books;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
}
